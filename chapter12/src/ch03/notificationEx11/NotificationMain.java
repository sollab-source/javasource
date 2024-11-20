package ch03.notificationEx11;

import java.util.LinkedList;
import java.util.Queue;

public class NotificationMain {

	public static void main(String[] args) {
		// LinkedList를 큐로 사용 notificationQueue
		Queue<Notification> notificationQueue = new LinkedList<>();

		// 큐에 데이터 추가(offer)
		notificationQueue.offer(new Notification("email", "Alex"));
		notificationQueue.offer(new Notification("sms", "Brian"));
		notificationQueue.offer(new Notification("chat", "Charlie"));

		// 큐에서 데이터 꺼내기 (poll)
		while (!notificationQueue.isEmpty()) {
			Notification notification = notificationQueue.poll();

			switch (notification.action) {
			case "chat":
				System.out.println(notification.name + "님에게 채팅 메세지를 보냅니다.");
				break;
			case "email":
				System.out.println(notification.name + "님에게 이메일을 보냅니다.");
				break;
			case "sms":
				System.out.println(notification.name + "님에게 SMS를 보냅니다.");
				break;
			}
		}
	}
}