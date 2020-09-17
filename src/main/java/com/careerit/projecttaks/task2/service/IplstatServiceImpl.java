package com.careerit.projecttaks.task2.service;

import java.util.List;
import java.util.Map;

import com.careerit.projecttaks.task2.domain.Team;
import com.careerit.projecttaks.task2.dto.PlayerDTO;
import com.careerit.projecttaks.task2.dto.RoleCountDTO;
import com.careerit.projecttaks.task2.dto.TeamAmountByRoleDTO;
import com.careerit.projecttaks.task2.dto.TeamAmountDTO;
import com.careerit.projecttaks.task2.dto.TeamDTO;
import com.careerit.projecttaks.task2.util.JsonReaderUtil;

public class IplstatServiceImpl implements IplstatService {

	private List<Team> teams;
	
	public IplstatServiceImpl(){
		teams = JsonReaderUtil.loadDataFromJson();
	}
	
	@Override
	public List<String> getTeamLabels() {
		
		return null;
	}

	@Override
	public List<PlayerDTO> getPlayerByTeam(String label) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RoleCountDTO> getCountByRole(String label) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerDTO> getPlayerByTeamAndRole(String label, String role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TeamDTO> getAllTeamDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TeamAmountDTO> getAmountSpentByTeams() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TeamAmountByRoleDTO> getAmountSpentByTeamAndRole(String label, String role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerDTO> getPlayersBySort(String fieldName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, List<PlayerDTO>> getMaxPaidPlayersByRole() {
		// TODO Auto-generated method stub
		return null;
	}

}
