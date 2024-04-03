package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import utility.DatabaseUtility;

import models.ActionAssignments;
import models.CorrectiveActions;
import models.PreventiveActions;

public class ActionAssignmentsDAO {

    public void addActionAssignments(ActionAssignments actionAssignments) {
        String sql = "INSERT INTO action_assignments (action_type, assigned_to, due_date, status, priority_level, comments, creation_date, last_modified_date, corrective_action_id, preventive_action_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseUtility.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, actionAssignments.getActionType());
            pstmt.setString(2, actionAssignments.getAssignedTo());
            pstmt.setDate(3, actionAssignments.getDueDate());
            pstmt.setString(4, actionAssignments.getStatus());
            pstmt.setString(5, actionAssignments.getPriorityLevel());
            pstmt.setString(6, actionAssignments.getComments());
            pstmt.setTimestamp(7, actionAssignments.getCreationDate());
            pstmt.setTimestamp(8, actionAssignments.getLastModifiedDate());
            pstmt.setInt(9, actionAssignments.getCorrectiveAction().getId());
            pstmt.setInt(10, actionAssignments.getPreventiveAction().getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<ActionAssignments> getAllActionAssignments() {
        List<ActionAssignments> actionAssignmentsList = new ArrayList<>();
        String sql = "SELECT * FROM action_assignments";
        try (Connection conn = DatabaseUtility.getConnection();
             PreparedStatement pstmt  = conn.prepareStatement(sql);
             ResultSet rs    = pstmt.executeQuery()) {
            while (rs.next()) {
                ActionAssignments actionAssignments = new ActionAssignments();
                actionAssignments.setId(rs.getInt("id"));
                actionAssignments.setActionType(rs.getString("action_type"));
                actionAssignments.setAssignedTo(rs.getString("assigned_to"));
                actionAssignments.setDueDate(rs.getDate("due_date"));
                actionAssignments.setStatus(rs.getString("status"));
                actionAssignments.setPriorityLevel(rs.getString("priority_level"));
                actionAssignments.setComments(rs.getString("comments"));
                actionAssignments.setCreationDate(rs.getTimestamp("creation_date"));
                actionAssignments.setLastModifiedDate(rs.getTimestamp("last_modified_date"));
                
                // Assuming CorrectiveActions and PreventiveActions DAOs exist and have a method to get by ID
                CorrectiveActionsDAO correctiveActionsDAO = new CorrectiveActionsDAO();
                PreventiveActionsDAO preventiveActionsDAO = new PreventiveActionsDAO();
                
                CorrectiveActions correctiveAction = correctiveActionsDAO.getCorrectiveActionById(rs.getInt("corrective_action_id"));
                PreventiveActions preventiveAction = preventiveActionsDAO.getPreventiveActionById(rs.getInt("preventive_action_id"));
                
                actionAssignments.setCorrectiveAction(correctiveAction);
                actionAssignments.setPreventiveAction(preventiveAction);

                actionAssignmentsList.add(actionAssignments);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return actionAssignmentsList;
    }

    public void updateActionAssignments(ActionAssignments actionAssignments) {
        String sql = "UPDATE action_assignments SET action_type = ?, assigned_to = ?, due_date = ?, status = ?, priority_level = ?, comments = ?, creation_date = ?, last_modified_date = ?, corrective_action_id = ?, preventive_action_id = ? WHERE id = ?";
        try (Connection conn = DatabaseUtility.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, actionAssignments.getActionType());
            pstmt.setString(2, actionAssignments.getAssignedTo());
            pstmt.setDate(3, actionAssignments.getDueDate());
            pstmt.setString(4, actionAssignments.getStatus());
            pstmt.setString(5, actionAssignments.getPriorityLevel());
            pstmt.setString(6, actionAssignments.getComments());
            pstmt.setTimestamp(7, actionAssignments.getCreationDate());
            pstmt.setTimestamp(8, actionAssignments.getLastModifiedDate());
            pstmt.setInt(9, actionAssignments.getCorrectiveAction().getId());
            pstmt.setInt(10, actionAssignments.getPreventiveAction().getId());
            pstmt.setInt(11, actionAssignments.getId());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteActionAssignments(int id) {
        String sql = "DELETE FROM action_assignments WHERE id = ?";
        try (Connection conn = DatabaseUtility.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    // Additional method(s) to get specific action assignments as per business logic can be implemented here
}