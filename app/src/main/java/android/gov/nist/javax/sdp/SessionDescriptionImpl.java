package android.gov.nist.javax.sdp;

import a.AbstractC1881a;
import a.AbstractC1883c;
import a.AbstractC1884d;
import a.AbstractC1886f;
import a.AbstractC1890j;
import a.AbstractC1891k;
import a.AbstractC1893m;
import a.AbstractC1894n;
import a.C1887g;
import a.C1889i;
import android.gov.nist.javax.sdp.fields.AttributeField;
import android.gov.nist.javax.sdp.fields.BandwidthField;
import android.gov.nist.javax.sdp.fields.ConnectionField;
import android.gov.nist.javax.sdp.fields.EmailField;
import android.gov.nist.javax.sdp.fields.InformationField;
import android.gov.nist.javax.sdp.fields.KeyField;
import android.gov.nist.javax.sdp.fields.MediaField;
import android.gov.nist.javax.sdp.fields.OriginField;
import android.gov.nist.javax.sdp.fields.PhoneField;
import android.gov.nist.javax.sdp.fields.ProtoVersionField;
import android.gov.nist.javax.sdp.fields.RepeatField;
import android.gov.nist.javax.sdp.fields.SDPField;
import android.gov.nist.javax.sdp.fields.SessionNameField;
import android.gov.nist.javax.sdp.fields.TimeField;
import android.gov.nist.javax.sdp.fields.URIField;
import android.gov.nist.javax.sdp.fields.ZoneField;
import java.text.ParseException;
import java.util.Iterator;
import java.util.Vector;

/* loaded from: classes.dex */
public class SessionDescriptionImpl implements AbstractC1890j {
    protected Vector attributesList;
    protected Vector bandwidthList;
    protected ConnectionField connectionImpl;
    private MediaDescriptionImpl currentMediaDescription;
    private TimeDescriptionImpl currentTimeDescription;
    protected Vector emailList;
    protected InformationField infoImpl;
    protected KeyField keyImpl;
    protected Vector mediaDescriptions;
    protected OriginField originImpl;
    protected Vector phoneList;
    protected SessionNameField sessionNameImpl;
    protected Vector timeDescriptions;
    protected URIField uriImpl;
    protected ProtoVersionField versionImpl;
    protected Vector zoneAdjustments;

    public SessionDescriptionImpl() {
    }

    private String encodeVector(Vector vector) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < vector.size(); i10++) {
            sb2.append(vector.elementAt(i10));
        }
        return sb2.toString();
    }

    public void addField(SDPField sDPField) {
        try {
            if (sDPField instanceof ProtoVersionField) {
                this.versionImpl = (ProtoVersionField) sDPField;
            } else if (sDPField instanceof OriginField) {
                this.originImpl = (OriginField) sDPField;
            } else if (sDPField instanceof SessionNameField) {
                this.sessionNameImpl = (SessionNameField) sDPField;
            } else if (sDPField instanceof InformationField) {
                MediaDescriptionImpl mediaDescriptionImpl = this.currentMediaDescription;
                if (mediaDescriptionImpl != null) {
                    mediaDescriptionImpl.setInformationField((InformationField) sDPField);
                } else {
                    this.infoImpl = (InformationField) sDPField;
                }
            } else if (sDPField instanceof URIField) {
                this.uriImpl = (URIField) sDPField;
            } else if (sDPField instanceof ConnectionField) {
                MediaDescriptionImpl mediaDescriptionImpl2 = this.currentMediaDescription;
                if (mediaDescriptionImpl2 != null) {
                    mediaDescriptionImpl2.setConnectionField((ConnectionField) sDPField);
                } else {
                    this.connectionImpl = (ConnectionField) sDPField;
                }
            } else if (sDPField instanceof KeyField) {
                MediaDescriptionImpl mediaDescriptionImpl3 = this.currentMediaDescription;
                if (mediaDescriptionImpl3 != null) {
                    mediaDescriptionImpl3.setKey((KeyField) sDPField);
                } else {
                    this.keyImpl = (KeyField) sDPField;
                }
            } else if (sDPField instanceof EmailField) {
                getEmails(true).add(sDPField);
            } else if (sDPField instanceof PhoneField) {
                getPhones(true).add(sDPField);
            } else if (sDPField instanceof TimeField) {
                this.currentTimeDescription = new TimeDescriptionImpl((TimeField) sDPField);
                getTimeDescriptions(true).add(this.currentTimeDescription);
            } else if (sDPField instanceof RepeatField) {
                TimeDescriptionImpl timeDescriptionImpl = this.currentTimeDescription;
                if (timeDescriptionImpl != null) {
                    timeDescriptionImpl.addRepeatField((RepeatField) sDPField);
                    return;
                }
                throw new ParseException("no time specified", 0);
            } else if (sDPField instanceof ZoneField) {
                getZoneAdjustments(true).add(sDPField);
            } else if (sDPField instanceof BandwidthField) {
                MediaDescriptionImpl mediaDescriptionImpl4 = this.currentMediaDescription;
                if (mediaDescriptionImpl4 != null) {
                    mediaDescriptionImpl4.addBandwidthField((BandwidthField) sDPField);
                } else {
                    getBandwidths(true).add(sDPField);
                }
            } else if (sDPField instanceof AttributeField) {
                if (this.currentMediaDescription != null) {
                    ((AttributeField) sDPField).getName();
                    this.currentMediaDescription.addAttribute((AttributeField) sDPField);
                    return;
                }
                getAttributes(true).add(sDPField);
            } else if (sDPField instanceof MediaField) {
                this.currentMediaDescription = new MediaDescriptionImpl();
                getMediaDescriptions(true).add(this.currentMediaDescription);
                this.currentMediaDescription.setMediaField((MediaField) sDPField);
            }
        } catch (C1887g unused) {
            throw new ParseException(sDPField.encode(), 0);
        }
    }

    public Object clone() {
        try {
            return new SessionDescriptionImpl(this);
        } catch (C1887g unused) {
            throw new CloneNotSupportedException();
        }
    }

    public String getAttribute(String str) {
        AttributeField attributeField;
        String name;
        if (str == null || this.attributesList == null) {
            return null;
        }
        for (int i10 = 0; i10 < this.attributesList.size(); i10++) {
            Object elementAt = this.attributesList.elementAt(i10);
            if ((elementAt instanceof AttributeField) && (name = (attributeField = (AttributeField) elementAt).getName()) != null && str.equals(name)) {
                return attributeField.getValue();
            }
        }
        return null;
    }

    @Override // a.AbstractC1890j
    public Vector getAttributes(boolean z10) {
        if (this.attributesList == null && z10) {
            this.attributesList = new Vector();
        }
        return this.attributesList;
    }

    public int getBandwidth(String str) {
        BandwidthField bandwidthField;
        String type;
        if (str == null || this.bandwidthList == null) {
            return -1;
        }
        for (int i10 = 0; i10 < this.bandwidthList.size(); i10++) {
            Object elementAt = this.bandwidthList.elementAt(i10);
            if ((elementAt instanceof BandwidthField) && (type = (bandwidthField = (BandwidthField) elementAt).getType()) != null && str.equals(type)) {
                return bandwidthField.getValue();
            }
        }
        return -1;
    }

    @Override // a.AbstractC1890j
    public Vector getBandwidths(boolean z10) {
        if (this.bandwidthList == null && z10) {
            this.bandwidthList = new Vector();
        }
        return this.bandwidthList;
    }

    @Override // a.AbstractC1890j
    public AbstractC1881a getConnection() {
        return this.connectionImpl;
    }

    @Override // a.AbstractC1890j
    public Vector getEmails(boolean z10) {
        if (this.emailList == null && z10) {
            this.emailList = new Vector();
        }
        return this.emailList;
    }

    @Override // a.AbstractC1890j
    public AbstractC1883c getInfo() {
        return this.infoImpl;
    }

    @Override // a.AbstractC1890j
    public AbstractC1884d getKey() {
        return this.keyImpl;
    }

    @Override // a.AbstractC1890j
    public Vector getMediaDescriptions(boolean z10) {
        if (this.mediaDescriptions == null && z10) {
            this.mediaDescriptions = new Vector();
        }
        return this.mediaDescriptions;
    }

    @Override // a.AbstractC1890j
    public AbstractC1886f getOrigin() {
        return this.originImpl;
    }

    @Override // a.AbstractC1890j
    public Vector getPhones(boolean z10) {
        if (this.phoneList == null && z10) {
            this.phoneList = new Vector();
        }
        return this.phoneList;
    }

    @Override // a.AbstractC1890j
    public AbstractC1891k getSessionName() {
        return this.sessionNameImpl;
    }

    @Override // a.AbstractC1890j
    public Vector getTimeDescriptions(boolean z10) {
        if (this.timeDescriptions == null && z10) {
            this.timeDescriptions = new Vector();
        }
        return this.timeDescriptions;
    }

    @Override // a.AbstractC1890j
    public AbstractC1893m getURI() {
        return this.uriImpl;
    }

    @Override // a.AbstractC1890j
    public AbstractC1894n getVersion() {
        return this.versionImpl;
    }

    @Override // a.AbstractC1890j
    public Vector getZoneAdjustments(boolean z10) {
        if (this.zoneAdjustments == null && z10) {
            this.zoneAdjustments = new Vector();
        }
        return this.zoneAdjustments;
    }

    public void removeAttribute(String str) {
        if (str != null && this.attributesList != null) {
            for (int i10 = 0; i10 < this.attributesList.size(); i10++) {
                Object elementAt = this.attributesList.elementAt(i10);
                if (elementAt instanceof AttributeField) {
                    AttributeField attributeField = (AttributeField) elementAt;
                    try {
                        String name = attributeField.getName();
                        if (name != null && str.equals(name)) {
                            this.attributesList.remove(attributeField);
                        }
                    } catch (C1889i unused) {
                    }
                }
            }
        }
    }

    public void removeBandwidth(String str) {
        if (str != null && this.bandwidthList != null) {
            for (int i10 = 0; i10 < this.bandwidthList.size(); i10++) {
                Object elementAt = this.bandwidthList.elementAt(i10);
                if (elementAt instanceof BandwidthField) {
                    BandwidthField bandwidthField = (BandwidthField) elementAt;
                    try {
                        String type = bandwidthField.getType();
                        if (type != null && str.equals(type)) {
                            this.bandwidthList.remove(bandwidthField);
                        }
                    } catch (C1889i unused) {
                    }
                }
            }
        }
    }

    public void setAttribute(String str, String str2) {
        AttributeField attributeField;
        String name;
        if (str != null && str2 != null) {
            if (this.attributesList != null) {
                for (int i10 = 0; i10 < this.attributesList.size(); i10++) {
                    Object elementAt = this.attributesList.elementAt(i10);
                    if ((elementAt instanceof AttributeField) && (name = (attributeField = (AttributeField) elementAt).getName()) != null && str.equals(name)) {
                        attributeField.setValue(str2);
                    }
                }
                return;
            }
            return;
        }
        throw new Exception("The parameter is null");
    }

    public void setAttributes(Vector vector) {
        if (vector != null) {
            this.attributesList = vector;
            return;
        }
        throw new Exception("The parameter is null");
    }

    public void setBandwidth(String str, int i10) {
        BandwidthField bandwidthField;
        String type;
        if (str != null) {
            if (this.bandwidthList != null) {
                for (int i11 = 0; i11 < this.bandwidthList.size(); i11++) {
                    Object elementAt = this.bandwidthList.elementAt(i11);
                    if ((elementAt instanceof BandwidthField) && (type = (bandwidthField = (BandwidthField) elementAt).getType()) != null && str.equals(type)) {
                        bandwidthField.setValue(i10);
                    }
                }
                return;
            }
            return;
        }
        throw new Exception("The parameter is null");
    }

    public void setBandwidths(Vector vector) {
        if (vector != null) {
            this.bandwidthList = vector;
            return;
        }
        throw new Exception("The parameter is null");
    }

    public void setConnection(AbstractC1881a abstractC1881a) {
        if (abstractC1881a != null) {
            if (abstractC1881a instanceof ConnectionField) {
                this.connectionImpl = (ConnectionField) abstractC1881a;
                return;
            }
            throw new Exception("Bad implementation class ConnectionField");
        }
        throw new Exception("The parameter is null");
    }

    public void setEmails(Vector vector) {
        if (vector != null) {
            this.emailList = vector;
            return;
        }
        throw new Exception("The parameter is null");
    }

    public void setInfo(AbstractC1883c abstractC1883c) {
        if (abstractC1883c != null) {
            if (abstractC1883c instanceof InformationField) {
                this.infoImpl = (InformationField) abstractC1883c;
                return;
            }
            throw new Exception("The parameter must be an instance of InformationField");
        }
        throw new Exception("The parameter is null");
    }

    public void setKey(AbstractC1884d abstractC1884d) {
        if (abstractC1884d != null) {
            if (abstractC1884d instanceof KeyField) {
                this.keyImpl = (KeyField) abstractC1884d;
                return;
            }
            throw new Exception("The parameter must be an instance of KeyField");
        }
        throw new Exception("The parameter is null");
    }

    public void setMediaDescriptions(Vector vector) {
        if (vector != null) {
            this.mediaDescriptions = vector;
            return;
        }
        throw new Exception("The parameter is null");
    }

    public void setOrigin(AbstractC1886f abstractC1886f) {
        if (abstractC1886f != null) {
            if (abstractC1886f instanceof OriginField) {
                this.originImpl = (OriginField) abstractC1886f;
                return;
            }
            throw new Exception("The parameter must be an instance of OriginField");
        }
        throw new Exception("The parameter is null");
    }

    public void setPhones(Vector vector) {
        if (vector != null) {
            this.phoneList = vector;
            return;
        }
        throw new Exception("The parameter is null");
    }

    public void setSessionName(AbstractC1891k abstractC1891k) {
        if (abstractC1891k != null) {
            if (abstractC1891k instanceof SessionNameField) {
                this.sessionNameImpl = (SessionNameField) abstractC1891k;
                return;
            }
            throw new Exception("The parameter must be an instance of SessionNameField");
        }
        throw new Exception("The parameter is null");
    }

    public void setTimeDescriptions(Vector vector) {
        if (vector != null) {
            this.timeDescriptions = vector;
            return;
        }
        throw new Exception("The parameter is null");
    }

    public void setURI(AbstractC1893m abstractC1893m) {
        if (abstractC1893m != null) {
            if (abstractC1893m instanceof URIField) {
                this.uriImpl = (URIField) abstractC1893m;
                return;
            }
            throw new Exception("The parameter must be an instance of URIField");
        }
        throw new Exception("The parameter is null");
    }

    public void setVersion(AbstractC1894n abstractC1894n) {
        if (abstractC1894n != null) {
            if (abstractC1894n instanceof ProtoVersionField) {
                this.versionImpl = (ProtoVersionField) abstractC1894n;
                return;
            }
            throw new Exception("The parameter must be an instance of VersionField");
        }
        throw new Exception("The parameter is null");
    }

    public void setZoneAdjustments(Vector vector) {
        if (vector != null) {
            this.zoneAdjustments = vector;
            return;
        }
        throw new Exception("The parameter is null");
    }

    public String toString() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        StringBuilder sb2 = new StringBuilder();
        String str14 = "";
        if (getVersion() == null) {
            str = str14;
        } else {
            str = getVersion().toString();
        }
        sb2.append(str);
        if (getOrigin() == null) {
            str2 = str14;
        } else {
            str2 = getOrigin().toString();
        }
        sb2.append(str2);
        if (getSessionName() == null) {
            str3 = str14;
        } else {
            str3 = getSessionName().toString();
        }
        sb2.append(str3);
        if (getInfo() == null) {
            str4 = str14;
        } else {
            str4 = getInfo().toString();
        }
        sb2.append(str4);
        try {
            if (getURI() == null) {
                str5 = str14;
            } else {
                str5 = getURI().toString();
            }
            sb2.append(str5);
            if (getEmails(false) == null) {
                str6 = str14;
            } else {
                str6 = encodeVector(getEmails(false));
            }
            sb2.append(str6);
            if (getPhones(false) == null) {
                str7 = str14;
            } else {
                str7 = encodeVector(getPhones(false));
            }
            sb2.append(str7);
            if (getConnection() == null) {
                str8 = str14;
            } else {
                str8 = getConnection().toString();
            }
            sb2.append(str8);
            if (getBandwidths(false) == null) {
                str9 = str14;
            } else {
                str9 = encodeVector(getBandwidths(false));
            }
            sb2.append(str9);
            if (getTimeDescriptions(false) == null) {
                str10 = str14;
            } else {
                str10 = encodeVector(getTimeDescriptions(false));
            }
            sb2.append(str10);
            if (getZoneAdjustments(false) == null) {
                str11 = str14;
            } else {
                str11 = encodeVector(getZoneAdjustments(false));
            }
            sb2.append(str11);
            if (getKey() == null) {
                str12 = str14;
            } else {
                str12 = getKey().toString();
            }
            sb2.append(str12);
            if (getAttributes(false) == null) {
                str13 = str14;
            } else {
                str13 = encodeVector(getAttributes(false));
            }
            sb2.append(str13);
            if (getMediaDescriptions(false) != null) {
                str14 = encodeVector(getMediaDescriptions(false));
            }
            sb2.append(str14);
        } catch (C1887g unused) {
        }
        return sb2.toString();
    }

    public SessionDescriptionImpl(AbstractC1890j abstractC1890j) {
        if (abstractC1890j == null) {
            return;
        }
        AbstractC1894n version = abstractC1890j.getVersion();
        if (version != null) {
            setVersion((AbstractC1894n) version.clone());
        }
        AbstractC1886f origin = abstractC1890j.getOrigin();
        if (origin != null) {
            setOrigin((AbstractC1886f) origin.clone());
        }
        AbstractC1891k sessionName = abstractC1890j.getSessionName();
        if (sessionName != null) {
            setSessionName((AbstractC1891k) sessionName.clone());
        }
        AbstractC1883c info = abstractC1890j.getInfo();
        if (info != null) {
            setInfo((AbstractC1883c) info.clone());
        }
        URIField uRIField = (URIField) abstractC1890j.getURI();
        if (uRIField != null) {
            URIField uRIField2 = new URIField();
            uRIField2.set(uRIField.get());
            setURI(uRIField2);
        }
        AbstractC1881a connection = abstractC1890j.getConnection();
        if (connection != null) {
            setConnection((AbstractC1881a) connection.clone());
        }
        AbstractC1884d key = abstractC1890j.getKey();
        if (key != null) {
            setKey((AbstractC1884d) key.clone());
        }
        Vector timeDescriptions = abstractC1890j.getTimeDescriptions(false);
        if (timeDescriptions != null) {
            Vector vector = new Vector();
            Iterator it = timeDescriptions.iterator();
            while (it.hasNext()) {
                TimeDescriptionImpl timeDescriptionImpl = (TimeDescriptionImpl) it.next();
                if (timeDescriptionImpl != null) {
                    TimeDescriptionImpl timeDescriptionImpl2 = new TimeDescriptionImpl((TimeField) timeDescriptionImpl.getTime().clone());
                    Vector repeatTimes = timeDescriptionImpl.getRepeatTimes(false);
                    if (repeatTimes != null) {
                        Iterator it2 = repeatTimes.iterator();
                        while (it2.hasNext()) {
                            RepeatField repeatField = (RepeatField) it2.next();
                            if (repeatField != null) {
                                timeDescriptionImpl2.addRepeatField((RepeatField) repeatField.clone());
                            }
                        }
                    }
                    vector.add(timeDescriptionImpl2);
                }
            }
            setTimeDescriptions(vector);
        }
        Vector emails = abstractC1890j.getEmails(false);
        if (emails != null) {
            Vector vector2 = new Vector();
            Iterator it3 = emails.iterator();
            while (it3.hasNext()) {
                EmailField emailField = (EmailField) it3.next();
                if (emailField != null) {
                    vector2.add((EmailField) emailField.clone());
                }
            }
            setEmails(vector2);
        }
        Vector phones = abstractC1890j.getPhones(false);
        if (phones != null) {
            Vector vector3 = new Vector();
            Iterator it4 = phones.iterator();
            while (it4.hasNext()) {
                PhoneField phoneField = (PhoneField) it4.next();
                if (phoneField != null) {
                    vector3.add((PhoneField) phoneField.clone());
                }
            }
            setPhones(vector3);
        }
        Vector zoneAdjustments = abstractC1890j.getZoneAdjustments(false);
        if (zoneAdjustments != null) {
            Vector vector4 = new Vector();
            Iterator it5 = zoneAdjustments.iterator();
            while (it5.hasNext()) {
                ZoneField zoneField = (ZoneField) it5.next();
                if (zoneField != null) {
                    vector4.add((ZoneField) zoneField.clone());
                }
            }
            setZoneAdjustments(vector4);
        }
        Vector bandwidths = abstractC1890j.getBandwidths(false);
        if (bandwidths != null) {
            Vector vector5 = new Vector();
            Iterator it6 = bandwidths.iterator();
            while (it6.hasNext()) {
                BandwidthField bandwidthField = (BandwidthField) it6.next();
                if (bandwidthField != null) {
                    vector5.add((BandwidthField) bandwidthField.clone());
                }
            }
            setBandwidths(vector5);
        }
        Vector attributes = abstractC1890j.getAttributes(false);
        if (attributes != null) {
            Vector vector6 = new Vector();
            Iterator it7 = attributes.iterator();
            while (it7.hasNext()) {
                AttributeField attributeField = (AttributeField) it7.next();
                if (attributeField != null) {
                    vector6.add((AttributeField) attributeField.clone());
                }
            }
            setAttributes(vector6);
        }
        Vector mediaDescriptions = abstractC1890j.getMediaDescriptions(false);
        if (mediaDescriptions == null) {
            return;
        }
        Vector vector7 = new Vector();
        Iterator it8 = mediaDescriptions.iterator();
        while (it8.hasNext()) {
            MediaDescriptionImpl mediaDescriptionImpl = (MediaDescriptionImpl) it8.next();
            if (mediaDescriptionImpl != null) {
                MediaDescriptionImpl mediaDescriptionImpl2 = new MediaDescriptionImpl();
                MediaField mediaField = mediaDescriptionImpl.getMediaField();
                if (mediaField != null) {
                    MediaField mediaField2 = new MediaField();
                    mediaField2.setMedia(mediaField.getMedia());
                    mediaField2.setPort(mediaField.getPort());
                    mediaField2.setNports(mediaField.getNports());
                    mediaField2.setProto(mediaField.getProto());
                    Vector formats = mediaField.getFormats();
                    if (formats != null) {
                        Vector vector8 = new Vector();
                        Iterator it9 = formats.iterator();
                        while (it9.hasNext()) {
                            Object next = it9.next();
                            if (next != null) {
                                vector8.add(String.valueOf(next));
                            }
                        }
                        mediaField2.setFormats(vector8);
                    }
                    mediaDescriptionImpl2.setMedia(mediaField2);
                }
                InformationField informationField = mediaDescriptionImpl.getInformationField();
                if (informationField != null) {
                    mediaDescriptionImpl2.setInformationField((InformationField) informationField.clone());
                }
                ConnectionField connectionField = mediaDescriptionImpl.getConnectionField();
                if (connectionField != null) {
                    mediaDescriptionImpl2.setConnectionField((ConnectionField) connectionField.clone());
                }
                Vector bandwidths2 = mediaDescriptionImpl.getBandwidths(false);
                if (bandwidths2 != null) {
                    Vector vector9 = new Vector();
                    Iterator it10 = bandwidths2.iterator();
                    while (it10.hasNext()) {
                        BandwidthField bandwidthField2 = (BandwidthField) it10.next();
                        if (bandwidthField2 != null) {
                            vector9.add((BandwidthField) bandwidthField2.clone());
                        }
                    }
                    mediaDescriptionImpl2.setBandwidths(vector9);
                }
                KeyField keyField = mediaDescriptionImpl.getKeyField();
                if (keyField != null) {
                    mediaDescriptionImpl2.setKeyField((KeyField) keyField.clone());
                }
                Vector attributeFields = mediaDescriptionImpl.getAttributeFields();
                if (attributeFields != null) {
                    Vector vector10 = new Vector();
                    Iterator it11 = attributeFields.iterator();
                    while (it11.hasNext()) {
                        AttributeField attributeField2 = (AttributeField) it11.next();
                        if (attributeField2 != null) {
                            vector10.add((AttributeField) attributeField2.clone());
                        }
                    }
                    mediaDescriptionImpl2.setAttributeFields(vector10);
                }
                vector7.add(mediaDescriptionImpl2);
            }
        }
        setMediaDescriptions(vector7);
    }
}
