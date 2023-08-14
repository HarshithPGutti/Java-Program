package com.xworkz.boot;

import com.xworkz.abstractTask.app.AcademicProject;
import com.xworkz.app.Project;

public class ProjectRunner {
	public static void main(String[] args) {

		System.out.println("Running main in ProjectRunner");

		Project project=new AcademicProject();

		project.start();
		project.pause();
		project.resume();
		project.complete();
		project.reportStatus();


        System.out.println(project.getProjectType());
        project.assignTeam();
        project.implement();
        project.review();
        project.deliver();

	}

}