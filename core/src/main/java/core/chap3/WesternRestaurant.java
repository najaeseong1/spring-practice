package core.chap3;

import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Setter;

@Setter
public class WesternRestaurant implements Restaurant {
	
	private Chef chef;
	
	//요리 코스
	private Course course;
	
	
	// 요리를 주문하는 기능
	public void order() {
		System.out.println("서양 요리를 주문합니다.");
		course.combineMenu();
		chef.cook();
	}

	public WesternRestaurant(@Qualifier("frenchChef") Chef chef, @Qualifier("frenchCourse")Course course) {
		super();
		this.chef = chef;
		this.course = course;
	}

}
