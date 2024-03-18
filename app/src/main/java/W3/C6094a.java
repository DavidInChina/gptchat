package w3;

/* renamed from: w3.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6094a {

    /* renamed from: a  reason: collision with root package name */
    public int f47820a;

    /* renamed from: b  reason: collision with root package name */
    public int f47821b;

    /* renamed from: c  reason: collision with root package name */
    public Object f47822c;

    /* renamed from: d  reason: collision with root package name */
    public int f47823d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6094a.class != obj.getClass()) {
            return false;
        }
        C6094a c6094a = (C6094a) obj;
        int i10 = this.f47820a;
        if (i10 != c6094a.f47820a) {
            return false;
        }
        if (i10 == 8 && Math.abs(this.f47823d - this.f47821b) == 1 && this.f47823d == c6094a.f47821b && this.f47821b == c6094a.f47823d) {
            return true;
        }
        if (this.f47823d != c6094a.f47823d || this.f47821b != c6094a.f47821b) {
            return false;
        }
        Object obj2 = this.f47822c;
        if (obj2 != null) {
            if (!obj2.equals(c6094a.f47822c)) {
                return false;
            }
        } else if (c6094a.f47822c != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f47820a * 31) + this.f47821b) * 31) + this.f47823d;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("[");
        int i10 = this.f47820a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 != 8) {
                        str = "??";
                    } else {
                        str = "mv";
                    }
                } else {
                    str = "up";
                }
            } else {
                str = "rm";
            }
        } else {
            str = "add";
        }
        sb2.append(str);
        sb2.append(",s:");
        sb2.append(this.f47821b);
        sb2.append("c:");
        sb2.append(this.f47823d);
        sb2.append(",p:");
        sb2.append(this.f47822c);
        sb2.append("]");
        return sb2.toString();
    }
}
