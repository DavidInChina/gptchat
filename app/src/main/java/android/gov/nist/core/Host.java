package android.gov.nist.core;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* loaded from: classes2.dex */
public class Host extends GenericObject {
    protected static final int HOSTNAME = 1;
    protected static final int IPV4ADDRESS = 2;
    protected static final int IPV6ADDRESS = 3;
    private static final long serialVersionUID = -7233564517978323344L;
    private static boolean stripAddressScopeZones = Boolean.getBoolean("android.gov.nist.core.STRIP_ADDR_SCOPES");
    protected int addressType;
    protected String hostname;
    private InetAddress inetAddress;

    public Host() {
        this.addressType = 1;
    }

    private boolean isIPv6Address(String str) {
        if (str != null && str.indexOf(58) != -1) {
            return true;
        }
        return false;
    }

    public static boolean isIPv6Reference(String str) {
        if (str.charAt(0) != '[' || str.charAt(str.length() - 1) != ']') {
            return false;
        }
        return true;
    }

    private void setHost(String str, int i10) {
        int indexOf;
        this.inetAddress = null;
        if (isIPv6Address(str)) {
            this.addressType = 3;
        } else {
            this.addressType = i10;
        }
        if (str != null) {
            String trim = str.trim();
            this.hostname = trim;
            if (this.addressType == 1) {
                this.hostname = trim.toLowerCase();
            }
            if (this.addressType == 3 && stripAddressScopeZones && (indexOf = this.hostname.indexOf(37)) != -1) {
                String substring = this.hostname.substring(0, indexOf);
                this.hostname = substring;
                if (substring.startsWith("[") && !this.hostname.endsWith("]")) {
                    this.hostname = a.n(new StringBuilder(), this.hostname, ']');
                }
            }
        }
    }

    @Override // android.gov.nist.core.GenericObject
    public String encode() {
        return encode(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return ((Host) obj).hostname.equals(this.hostname);
    }

    public String getAddress() {
        return this.hostname;
    }

    public String getHostname() {
        return this.hostname;
    }

    public InetAddress getInetAddress() {
        String str = this.hostname;
        if (str == null) {
            return null;
        }
        InetAddress inetAddress = this.inetAddress;
        if (inetAddress != null) {
            return inetAddress;
        }
        InetAddress byName = InetAddress.getByName(str);
        this.inetAddress = byName;
        return byName;
    }

    public String getIpAddress() {
        String str = this.hostname;
        if (str == null) {
            return null;
        }
        int i10 = this.addressType;
        if (i10 == 1) {
            try {
                if (this.inetAddress == null) {
                    this.inetAddress = InetAddress.getByName(str);
                }
                return this.inetAddress.getHostAddress();
            } catch (UnknownHostException e10) {
                dbgPrint("Could not resolve hostname " + e10);
            }
        } else if (i10 == 3) {
            try {
                String inetAddress = getInetAddress().toString();
                int indexOf = inetAddress.indexOf(Separators.SLASH);
                if (indexOf != -1) {
                    inetAddress = inetAddress.substring(indexOf + 1, inetAddress.length());
                }
                if (this.hostname.startsWith("[")) {
                    return "[" + inetAddress + ']';
                }
                return inetAddress;
            } catch (UnknownHostException e11) {
                e11.printStackTrace();
            }
        } else {
            return str;
        }
        return null;
    }

    public int hashCode() {
        return getHostname().hashCode();
    }

    public boolean isHostname() {
        if (this.addressType == 1) {
            return true;
        }
        return false;
    }

    public boolean isIPAddress() {
        if (this.addressType != 1) {
            return true;
        }
        return false;
    }

    public void setAddress(String str) {
        setHostAddress(str);
    }

    public void setHostAddress(String str) {
        setHost(str, 2);
    }

    public void setHostname(String str) {
        setHost(str, 1);
    }

    @Override // android.gov.nist.core.GenericObject
    public StringBuilder encode(StringBuilder sb2) {
        if (this.addressType == 3 && !isIPv6Reference(this.hostname)) {
            sb2.append('[');
            sb2.append(this.hostname);
            sb2.append(']');
        } else {
            sb2.append(this.hostname);
        }
        return sb2;
    }

    public Host(String str) {
        if (str != null) {
            setHost(str, 2);
            return;
        }
        throw new IllegalArgumentException("null host name");
    }

    public Host(String str, int i10) {
        setHost(str, i10);
    }
}
