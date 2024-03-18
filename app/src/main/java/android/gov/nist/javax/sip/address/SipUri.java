package android.gov.nist.javax.sip.address;

import R.a;
import android.gov.nist.core.Debug;
import android.gov.nist.core.GenericObject;
import android.gov.nist.core.Host;
import android.gov.nist.core.HostPort;
import android.gov.nist.core.NameValue;
import android.gov.nist.core.NameValueList;
import android.gov.nist.core.Separators;
import android.javax.sip.j;
import android.javax.sip.n;
import android.javax.sip.o;
import b.AbstractC2094d;
import c.AbstractC2270z;
import java.text.ParseException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class SipUri extends GenericURI implements AbstractC2094d, SipURIExt {
    private static final long serialVersionUID = 7749781076218987044L;
    protected Authority authority;
    protected NameValueList qheaders;
    protected TelephoneNumber telephoneSubscriber;
    protected NameValueList uriParms = new NameValueList();

    public SipUri() {
        this.scheme = "sip";
        NameValueList nameValueList = new NameValueList();
        this.qheaders = nameValueList;
        nameValueList.setSeparator(Separators.AND);
    }

    public void clearPassword() {
        UserInfo userInfo;
        Authority authority = this.authority;
        if (authority != null && (userInfo = authority.getUserInfo()) != null) {
            userInfo.clearPassword();
        }
    }

    public void clearQheaders() {
        this.qheaders = new NameValueList();
    }

    public void clearUriParms() {
        this.uriParms = new NameValueList();
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        SipUri sipUri = (SipUri) super.clone();
        Authority authority = this.authority;
        if (authority != null) {
            sipUri.authority = (Authority) authority.clone();
        }
        NameValueList nameValueList = this.uriParms;
        if (nameValueList != null) {
            sipUri.uriParms = (NameValueList) nameValueList.clone();
        }
        NameValueList nameValueList2 = this.qheaders;
        if (nameValueList2 != null) {
            sipUri.qheaders = (NameValueList) nameValueList2.clone();
        }
        TelephoneNumber telephoneNumber = this.telephoneSubscriber;
        if (telephoneNumber != null) {
            sipUri.telephoneSubscriber = (TelephoneNumber) telephoneNumber.clone();
        }
        return sipUri;
    }

    @Override // android.gov.nist.javax.sip.address.GenericURI, android.gov.nist.core.GenericObject
    public String encode() {
        return encode(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.address.GenericURI, android.gov.nist.javax.sip.address.NetObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2094d)) {
            return false;
        }
        AbstractC2094d abstractC2094d = (AbstractC2094d) obj;
        if (isSecure() ^ abstractC2094d.isSecure()) {
            return false;
        }
        if (getUser() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (abstractC2094d.getUser() == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 ^ z11) {
            return false;
        }
        if (getUserPassword() == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (abstractC2094d.getUserPassword() == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 ^ z13) {
            return false;
        }
        if (getUser() != null && !UriDecoder.decode(getUser()).equals(UriDecoder.decode(abstractC2094d.getUser()))) {
            return false;
        }
        if (getUserPassword() != null && !UriDecoder.decode(getUserPassword()).equals(UriDecoder.decode(abstractC2094d.getUserPassword()))) {
            return false;
        }
        if (getHost() == null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (abstractC2094d.getHost() == null) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z14 ^ z15) {
            return false;
        }
        if ((getHost() != null && !getHost().equalsIgnoreCase(abstractC2094d.getHost())) || getPort() != abstractC2094d.getPort()) {
            return false;
        }
        Iterator parameterNames = getParameterNames();
        while (parameterNames.hasNext()) {
            String str = (String) parameterNames.next();
            String parameter = getParameter(str);
            String parameter2 = abstractC2094d.getParameter(str);
            if (parameter != null && parameter2 != null && !UriDecoder.decode(parameter).equalsIgnoreCase(UriDecoder.decode(parameter2))) {
                return false;
            }
        }
        if (getTransportParam() == null) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (abstractC2094d.getTransportParam() == null) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (z16 ^ z17) {
            return false;
        }
        if (getUserParam() == null) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (abstractC2094d.getUserParam() == null) {
            z19 = true;
        } else {
            z19 = false;
        }
        if (z18 ^ z19) {
            return false;
        }
        if (getTTLParam() == -1) {
            z20 = true;
        } else {
            z20 = false;
        }
        if (abstractC2094d.getTTLParam() == -1) {
            z21 = true;
        } else {
            z21 = false;
        }
        if (z20 ^ z21) {
            return false;
        }
        if (getMethodParam() == null) {
            z22 = true;
        } else {
            z22 = false;
        }
        if (abstractC2094d.getMethodParam() == null) {
            z23 = true;
        } else {
            z23 = false;
        }
        if (z22 ^ z23) {
            return false;
        }
        if (getMAddrParam() == null) {
            z24 = true;
        } else {
            z24 = false;
        }
        if (abstractC2094d.getMAddrParam() == null) {
            z25 = true;
        } else {
            z25 = false;
        }
        if (z24 ^ z25) {
            return false;
        }
        if (getHeaderNames().hasNext() && !abstractC2094d.getHeaderNames().hasNext()) {
            return false;
        }
        if (!getHeaderNames().hasNext() && abstractC2094d.getHeaderNames().hasNext()) {
            return false;
        }
        if (getHeaderNames().hasNext() && abstractC2094d.getHeaderNames().hasNext()) {
            try {
                o a5 = o.a();
                if (a5.f24334a == null) {
                    try {
                        a5.f24334a = (AbstractC2270z) Class.forName("gov.nist.".concat("javax.sip.header.HeaderFactoryImpl")).newInstance();
                    } catch (Exception e10) {
                        throw new n("The Peer Factory: gov.nist.javax.sip.header.HeaderFactoryImpl could not be instantiated. Ensure the Path Name has been set.", e10);
                    }
                }
                AbstractC2270z abstractC2270z = a5.f24334a;
                Iterator headerNames = getHeaderNames();
                while (headerNames.hasNext()) {
                    String str2 = (String) headerNames.next();
                    String header = getHeader(str2);
                    String header2 = abstractC2094d.getHeader(str2);
                    if (header == null && header2 != null) {
                        return false;
                    }
                    if (header2 == null && header != null) {
                        return false;
                    }
                    if (header != null || header2 != null) {
                        try {
                            if (!abstractC2270z.createHeader(str2, UriDecoder.decode(header)).equals(abstractC2270z.createHeader(str2, UriDecoder.decode(header2)))) {
                                return false;
                            }
                        } catch (ParseException e11) {
                            Debug.logError("Cannot parse one of the header of the sip uris to compare " + this + Separators.SP + abstractC2094d, e11);
                            return false;
                        }
                    }
                }
            } catch (j e12) {
                Debug.logError("Cannot get the header factory to parse the header of the sip uris to compare", e12);
                return false;
            }
        }
        return true;
    }

    public Authority getAuthority() {
        return this.authority;
    }

    public String getGrParam() {
        return (String) this.uriParms.getValue("gr");
    }

    @Override // b.AbstractC2094d
    public String getHeader(String str) {
        if (this.qheaders.getValue(str) != null) {
            return this.qheaders.getValue(str).toString();
        }
        return null;
    }

    @Override // b.AbstractC2094d
    public Iterator<String> getHeaderNames() {
        return this.qheaders.getNames();
    }

    @Override // b.AbstractC2094d
    public String getHost() {
        Authority authority = this.authority;
        if (authority == null || authority.getHost() == null) {
            return null;
        }
        return this.authority.getHost().encode();
    }

    public HostPort getHostPort() {
        Authority authority = this.authority;
        if (authority != null && authority.getHost() != null) {
            return this.authority.getHostPort();
        }
        return null;
    }

    public String getLrParam() {
        if (hasParameter("lr")) {
            return "true";
        }
        return null;
    }

    @Override // b.AbstractC2094d
    public String getMAddrParam() {
        NameValue nameValue = this.uriParms.getNameValue("maddr");
        if (nameValue == null) {
            return null;
        }
        return (String) nameValue.getValueAsObject();
    }

    public String getMethod() {
        return (String) getParm("method");
    }

    @Override // b.AbstractC2094d
    public String getMethodParam() {
        return getParameter("method");
    }

    @Override // c.AbstractC2236H
    public String getParameter(String str) {
        Object value = this.uriParms.getValue(str);
        if (value == null) {
            return null;
        }
        if (value instanceof GenericObject) {
            return ((GenericObject) value).encode();
        }
        return value.toString();
    }

    @Override // c.AbstractC2236H
    public Iterator<String> getParameterNames() {
        return this.uriParms.getNames();
    }

    public NameValueList getParameters() {
        return this.uriParms;
    }

    public Object getParm(String str) {
        return this.uriParms.getValue(str);
    }

    @Override // b.AbstractC2094d
    public int getPort() {
        HostPort hostPort = getHostPort();
        if (hostPort == null) {
            return -1;
        }
        return hostPort.getPort();
    }

    public NameValueList getQheaders() {
        return this.qheaders;
    }

    @Override // android.gov.nist.javax.sip.address.GenericURI, b.AbstractC2096f
    public String getScheme() {
        return this.scheme;
    }

    @Override // b.AbstractC2094d
    public int getTTLParam() {
        Integer num = (Integer) this.uriParms.getValue("ttl");
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public TelephoneNumber getTelephoneSubscriber() {
        if (this.telephoneSubscriber == null) {
            this.telephoneSubscriber = new TelephoneNumber();
        }
        return this.telephoneSubscriber;
    }

    @Override // b.AbstractC2094d
    public String getTransportParam() {
        NameValueList nameValueList = this.uriParms;
        if (nameValueList != null) {
            return (String) nameValueList.getValue(android.gov.nist.javax.sip.header.ParameterNames.TRANSPORT);
        }
        return null;
    }

    @Override // b.AbstractC2094d
    public String getUser() {
        return this.authority.getUser();
    }

    public String getUserAtHost() {
        String str;
        StringBuilder sb2;
        if (this.authority.getUserInfo() == null) {
            str = "";
        } else {
            str = this.authority.getUserInfo().getUser();
        }
        String encode = this.authority.getHost().encode();
        if (str != null && !str.equals("")) {
            sb2 = new StringBuilder(str);
            sb2.append(Separators.AT);
        } else {
            sb2 = new StringBuilder();
        }
        sb2.append(encode);
        return sb2.toString();
    }

    public String getUserAtHostPort() {
        String str;
        StringBuilder sb2;
        if (this.authority.getUserInfo() == null) {
            str = "";
        } else {
            str = this.authority.getUserInfo().getUser();
        }
        String encode = this.authority.getHost().encode();
        int port = this.authority.getPort();
        if (str != null && !str.equals("")) {
            sb2 = new StringBuilder(str);
            sb2.append(Separators.AT);
        } else {
            sb2 = new StringBuilder();
        }
        if (port != -1) {
            sb2.append(encode);
            sb2.append(":");
            sb2.append(port);
            return sb2.toString();
        }
        sb2.append(encode);
        return sb2.toString();
    }

    @Override // b.AbstractC2094d
    public String getUserParam() {
        return getParameter("user");
    }

    @Override // b.AbstractC2094d
    public String getUserPassword() {
        Authority authority = this.authority;
        if (authority == null) {
            return null;
        }
        return authority.getPassword();
    }

    public String getUserType() {
        return (String) this.uriParms.getValue("user");
    }

    @Override // android.gov.nist.javax.sip.address.SipURIExt
    public boolean hasGrParam() {
        if (this.uriParms.getNameValue("gr") != null) {
            return true;
        }
        return false;
    }

    @Override // b.AbstractC2094d
    public boolean hasLrParam() {
        if (this.uriParms.getNameValue("lr") != null) {
            return true;
        }
        return false;
    }

    public boolean hasParameter(String str) {
        if (this.uriParms.getValue(str) != null) {
            return true;
        }
        return false;
    }

    public boolean hasTransport() {
        return hasParameter(android.gov.nist.javax.sip.header.ParameterNames.TRANSPORT);
    }

    @Override // b.AbstractC2094d
    public boolean isSecure() {
        return getScheme().equalsIgnoreCase("sips");
    }

    @Override // android.gov.nist.javax.sip.address.GenericURI, b.AbstractC2096f
    public boolean isSipURI() {
        return true;
    }

    public boolean isUserTelephoneSubscriber() {
        String str = (String) this.uriParms.getValue("user");
        if (str == null) {
            return false;
        }
        return str.equalsIgnoreCase("phone");
    }

    @Override // android.gov.nist.javax.sip.address.SipURIExt
    public void removeHeader(String str) {
        NameValueList nameValueList = this.qheaders;
        if (nameValueList != null) {
            nameValueList.delete(str);
        }
    }

    @Override // android.gov.nist.javax.sip.address.SipURIExt
    public void removeHeaders() {
        this.qheaders = new NameValueList();
    }

    public void removeMAddr() {
        NameValueList nameValueList = this.uriParms;
        if (nameValueList != null) {
            nameValueList.delete("maddr");
        }
    }

    public void removeMethod() {
        NameValueList nameValueList = this.uriParms;
        if (nameValueList != null) {
            nameValueList.delete("method");
        }
    }

    @Override // c.AbstractC2236H
    public void removeParameter(String str) {
        this.uriParms.delete(str);
    }

    public void removeParameters() {
        this.uriParms = new NameValueList();
    }

    @Override // android.gov.nist.javax.sip.address.SipURIExt
    public void removePort() {
        this.authority.removePort();
    }

    public void removeTTL() {
        NameValueList nameValueList = this.uriParms;
        if (nameValueList != null) {
            nameValueList.delete("ttl");
        }
    }

    public void removeTransport() {
        NameValueList nameValueList = this.uriParms;
        if (nameValueList != null) {
            nameValueList.delete(android.gov.nist.javax.sip.header.ParameterNames.TRANSPORT);
        }
    }

    public void removeUser() {
        this.authority.removeUserInfo();
    }

    public void removeUserType() {
        NameValueList nameValueList = this.uriParms;
        if (nameValueList != null) {
            nameValueList.delete("user");
        }
    }

    public void setAuthority(Authority authority) {
        this.authority = authority;
    }

    public void setDefaultParm(String str, Object obj) {
        if (this.uriParms.getValue(str) == null) {
            this.uriParms.set(new NameValue(str, obj));
        }
    }

    @Override // android.gov.nist.javax.sip.address.SipURIExt
    public void setGrParam(String str) {
        this.uriParms.set("gr", str);
    }

    @Override // android.gov.nist.javax.sip.address.SipURIExt
    public void setHeader(String str, String str2) {
        this.qheaders.set(new NameValue(str, str2));
    }

    public void setHost(Host host) {
        if (this.authority == null) {
            this.authority = new Authority();
        }
        this.authority.setHost(host);
    }

    public void setHostPort(HostPort hostPort) {
        if (this.authority == null) {
            this.authority = new Authority();
        }
        this.authority.setHostPort(hostPort);
    }

    public void setIsdnSubAddress(String str) {
        if (this.telephoneSubscriber == null) {
            this.telephoneSubscriber = new TelephoneNumber();
        }
        this.telephoneSubscriber.setIsdnSubaddress(str);
    }

    @Override // android.gov.nist.javax.sip.address.SipURIExt
    public void setLrParam() {
        this.uriParms.set("lr", null);
    }

    public void setMAddr(String str) {
        NameValue nameValue = this.uriParms.getNameValue("maddr");
        Host host = new Host();
        host.setAddress(str);
        if (nameValue != null) {
            nameValue.setValueAsObject(host);
            return;
        }
        this.uriParms.set(new NameValue("maddr", host));
    }

    @Override // b.AbstractC2094d
    public void setMAddrParam(String str) {
        if (str != null) {
            setParameter("maddr", str);
            return;
        }
        throw new NullPointerException("bad maddr");
    }

    public void setMethod(String str) {
        this.uriParms.set("method", str);
    }

    @Override // android.gov.nist.javax.sip.address.SipURIExt
    public void setMethodParam(String str) {
        setParameter("method", str);
    }

    @Override // c.AbstractC2236H
    public void setParameter(String str, String str2) {
        if (str.equalsIgnoreCase("ttl")) {
            try {
                Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
                throw new ParseException(a.r("bad parameter ", str2), 0);
            }
        }
        this.uriParms.set(str, str2);
    }

    @Override // b.AbstractC2094d
    public void setPort(int i10) {
        if (this.authority == null) {
            this.authority = new Authority();
        }
        this.authority.setPort(i10);
    }

    public void setQHeader(NameValue nameValue) {
        this.qheaders.set(nameValue);
    }

    public void setQheaders(NameValueList nameValueList) {
        this.qheaders = nameValueList;
    }

    public void setScheme(String str) {
        if (str.compareToIgnoreCase("sip") != 0 && str.compareToIgnoreCase("sips") != 0) {
            throw new IllegalArgumentException("bad scheme ".concat(str));
        }
        this.scheme = str.toLowerCase();
    }

    @Override // b.AbstractC2094d
    public void setSecure(boolean z10) {
        if (z10) {
            this.scheme = "sips";
        } else {
            this.scheme = "sip";
        }
    }

    @Override // android.gov.nist.javax.sip.address.SipURIExt
    public void setTTLParam(int i10) {
        if (i10 > 0) {
            if (this.uriParms != null) {
                this.uriParms.set(new NameValue("ttl", Integer.valueOf(i10)));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Bad ttl value");
    }

    public void setTelephoneSubscriber(TelephoneNumber telephoneNumber) {
        this.telephoneSubscriber = telephoneNumber;
    }

    @Override // b.AbstractC2094d
    public void setTransportParam(String str) {
        if (str != null) {
            this.uriParms.set(new NameValue(android.gov.nist.javax.sip.header.ParameterNames.TRANSPORT, str.toLowerCase()));
            return;
        }
        throw new NullPointerException("null arg");
    }

    public void setUriParameter(NameValue nameValue) {
        this.uriParms.set(nameValue);
    }

    public void setUriParm(String str, Object obj) {
        this.uriParms.set(new NameValue(str, obj));
    }

    public void setUriParms(NameValueList nameValueList) {
        this.uriParms = nameValueList;
    }

    @Override // b.AbstractC2094d
    public void setUser(String str) {
        if (this.authority == null) {
            this.authority = new Authority();
        }
        this.authority.setUser(str);
    }

    @Override // android.gov.nist.javax.sip.address.SipURIExt
    public void setUserParam(String str) {
        this.uriParms.set("user", str);
    }

    @Override // android.gov.nist.javax.sip.address.SipURIExt
    public void setUserPassword(String str) {
        if (this.authority == null) {
            this.authority = new Authority();
        }
        this.authority.setPassword(str);
    }

    @Override // android.gov.nist.javax.sip.address.GenericURI, android.gov.nist.javax.sip.address.NetObject, b.AbstractC2096f
    public String toString() {
        return encode();
    }

    @Override // android.gov.nist.javax.sip.address.GenericURI, android.gov.nist.core.GenericObject
    public StringBuilder encode(StringBuilder sb2) {
        sb2.append(this.scheme);
        sb2.append(":");
        Authority authority = this.authority;
        if (authority != null) {
            authority.encode(sb2);
        }
        if (!this.uriParms.isEmpty()) {
            sb2.append(Separators.SEMICOLON);
            this.uriParms.encode(sb2);
        }
        if (!this.qheaders.isEmpty()) {
            sb2.append(Separators.QUESTION);
            this.qheaders.encode(sb2);
        }
        return sb2;
    }

    @Override // b.AbstractC2094d
    public void setHost(String str) {
        setHost(new Host(str));
    }
}
