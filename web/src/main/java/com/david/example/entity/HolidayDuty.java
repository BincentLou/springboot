package com.david.example.entity;

import java.io.Serializable;

public class HolidayDuty extends HolidayDutyKey implements Serializable {
    /** 节假日类型 */
    private String holidayType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table holiday_duty
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column holiday_duty.holiday_type
     *
     * @return the value of holiday_duty.holiday_type
     *
     * @mbg.generated
     */
    public String getHolidayType() {
        return holidayType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column holiday_duty.holiday_type
     *
     * @param holidayType the value for holiday_duty.holiday_type
     *
     * @mbg.generated
     */
    public void setHolidayType(String holidayType) {
        this.holidayType = holidayType == null ? null : holidayType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table holiday_duty
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        HolidayDuty other = (HolidayDuty) that;
        return (this.getUserWorkNumber() == null ? other.getUserWorkNumber() == null : this.getUserWorkNumber().equals(other.getUserWorkNumber()))
            && (this.getDutyDate() == null ? other.getDutyDate() == null : this.getDutyDate().equals(other.getDutyDate()))
            && (this.getHolidayType() == null ? other.getHolidayType() == null : this.getHolidayType().equals(other.getHolidayType()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table holiday_duty
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserWorkNumber() == null) ? 0 : getUserWorkNumber().hashCode());
        result = prime * result + ((getDutyDate() == null) ? 0 : getDutyDate().hashCode());
        result = prime * result + ((getHolidayType() == null) ? 0 : getHolidayType().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table holiday_duty
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", holidayType=").append(holidayType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}