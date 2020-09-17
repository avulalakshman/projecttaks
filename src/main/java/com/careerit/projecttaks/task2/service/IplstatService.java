package com.careerit.projecttaks.task2.service;

import java.util.List;
import java.util.Map;

import com.careerit.projecttaks.task2.dto.PlayerDTO;
import com.careerit.projecttaks.task2.dto.RoleCountDTO;
import com.careerit.projecttaks.task2.dto.TeamAmountByRoleDTO;
import com.careerit.projecttaks.task2.dto.TeamAmountDTO;
import com.careerit.projecttaks.task2.dto.TeamDTO;

public interface IplstatService {
	public List<String> getTeamLabels();

	public List<PlayerDTO> getPlayerByTeam(String label);

	public List<RoleCountDTO> getCountByRole(String label);

	public List<PlayerDTO> getPlayerByTeamAndRole(String label, String role);

	public List<TeamDTO> getAllTeamDetails();

	public List<TeamAmountDTO> getAmountSpentByTeams();

	public List<TeamAmountByRoleDTO> getAmountSpentByTeamAndRole(String label,String role);

	public List<PlayerDTO> getPlayersBySort(String fieldName);

	public Map<String,List<PlayerDTO>> getMaxPaidPlayersByRole();
}
