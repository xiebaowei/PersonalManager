package com.pm.model;



//考评表属性定义及对应方法（get,set,toString,构造方法等）定义
public class Evalu {

		//考评Id
		private int id;
		//员工ID（与用户Id对应相同）
		private int empid;
		//员工姓名
		private String name;
		//考评类型
		private String lx;
		//考评结果
		private String result;
		//考评时间
		private String time;
		
		public Evalu(int empid, String lx, String result, String time) {
			super();
			this.empid = empid;
			this.lx = lx;
			this.result = result;
			this.time = time;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}
		public int getEmpid() {
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLx() {
			return lx;
		}

		public void setLx(String lx) {
			this.lx = lx;
		}

		public String getResult() {
			return result;
		}

		public void setResult(String result) {
			this.result = result;
		}

		public String getTime() {
			return time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		@Override
		public String toString() {
			return "Evalu [id=" + id + ", empid=" + empid + ", name=" + name
					+ ", lx=" + lx + ", result=" + result + ", time=" + time
					+ "]";
		}

		public Evalu() {
			super();
		}
		
	

}
