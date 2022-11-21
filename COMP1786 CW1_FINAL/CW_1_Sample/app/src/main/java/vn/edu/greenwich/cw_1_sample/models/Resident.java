package vn.edu.greenwich.cw_1_sample.models;

import android.util.Log;

import java.io.Serializable;

public class Resident implements Serializable {
    protected long _id;
    protected String _name;
    protected String _startDate;
    protected String _Destination;
    protected int _risk;
    protected String _transport;
    protected String _bill;

    public Resident() {
        _id = -1;
        _name = null;
        _startDate = null;
        _risk = -1;
        _Destination = null;
        _bill=null;
        _transport=null;

    }

    public Resident(long id, String name, String bill,String destination,String transport , String startDate, int risk) {
        _id = id;
        _name = name;
        _transport =transport;
        _bill=bill;
        _Destination=destination;
        _startDate = startDate;
        _risk = risk;
    }

    public long getId() { return _id; }
    public void setId(long id) {
        _id = id;
    }

    public String getName() {
        return _name;
    }
    public void setName(String name) {
        _name = name;
    }

    public String getStartDate() {
        return _startDate;
    }
    public void setStartDate(String startDate) {
        _startDate = startDate;
    }

    public int getOwner() {
        return _risk;
    }
    public void setOwner(int risk) {
        _risk = risk;
    }
    public String get_Destination() {
        return _Destination;
    }
    public void set_Destination(String destination) {
        _Destination = destination;
    }
    public String get_bill(){ return  _bill;}
    public void set_bill(String bill){ _bill= bill;}
    public String get_transport(){return _transport;}
    public void set_transport(String transport){ _transport=transport;}

    public boolean isEmpty() {
        if (-1 == _id && null == _name && null == _startDate && -1 == _risk)
            return true;

        return false;
    }

    @Override
    public String toString() {
        return "[" + _startDate + "] " + _name;
    }
}