package d7;

/* loaded from: classes.dex */
public final class i extends AbstractC2601a {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f28084a;

    /* renamed from: b  reason: collision with root package name */
    public final String f28085b;

    /* renamed from: c  reason: collision with root package name */
    public final String f28086c;

    /* renamed from: d  reason: collision with root package name */
    public final String f28087d;

    /* renamed from: e  reason: collision with root package name */
    public final String f28088e;

    /* renamed from: f  reason: collision with root package name */
    public final String f28089f;

    /* renamed from: g  reason: collision with root package name */
    public final String f28090g;

    /* renamed from: h  reason: collision with root package name */
    public final String f28091h;

    /* renamed from: i  reason: collision with root package name */
    public final String f28092i;

    /* renamed from: j  reason: collision with root package name */
    public final String f28093j;

    /* renamed from: k  reason: collision with root package name */
    public final String f28094k;

    /* renamed from: l  reason: collision with root package name */
    public final String f28095l;

    public i(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f28084a = num;
        this.f28085b = str;
        this.f28086c = str2;
        this.f28087d = str3;
        this.f28088e = str4;
        this.f28089f = str5;
        this.f28090g = str6;
        this.f28091h = str7;
        this.f28092i = str8;
        this.f28093j = str9;
        this.f28094k = str10;
        this.f28095l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2601a)) {
            return false;
        }
        AbstractC2601a abstractC2601a = (AbstractC2601a) obj;
        Integer num = this.f28084a;
        if (num != null ? num.equals(((i) abstractC2601a).f28084a) : ((i) abstractC2601a).f28084a == null) {
            String str = this.f28085b;
            if (str != null ? str.equals(((i) abstractC2601a).f28085b) : ((i) abstractC2601a).f28085b == null) {
                String str2 = this.f28086c;
                if (str2 != null ? str2.equals(((i) abstractC2601a).f28086c) : ((i) abstractC2601a).f28086c == null) {
                    String str3 = this.f28087d;
                    if (str3 != null ? str3.equals(((i) abstractC2601a).f28087d) : ((i) abstractC2601a).f28087d == null) {
                        String str4 = this.f28088e;
                        if (str4 != null ? str4.equals(((i) abstractC2601a).f28088e) : ((i) abstractC2601a).f28088e == null) {
                            String str5 = this.f28089f;
                            if (str5 != null ? str5.equals(((i) abstractC2601a).f28089f) : ((i) abstractC2601a).f28089f == null) {
                                String str6 = this.f28090g;
                                if (str6 != null ? str6.equals(((i) abstractC2601a).f28090g) : ((i) abstractC2601a).f28090g == null) {
                                    String str7 = this.f28091h;
                                    if (str7 != null ? str7.equals(((i) abstractC2601a).f28091h) : ((i) abstractC2601a).f28091h == null) {
                                        String str8 = this.f28092i;
                                        if (str8 != null ? str8.equals(((i) abstractC2601a).f28092i) : ((i) abstractC2601a).f28092i == null) {
                                            String str9 = this.f28093j;
                                            if (str9 != null ? str9.equals(((i) abstractC2601a).f28093j) : ((i) abstractC2601a).f28093j == null) {
                                                String str10 = this.f28094k;
                                                if (str10 != null ? str10.equals(((i) abstractC2601a).f28094k) : ((i) abstractC2601a).f28094k == null) {
                                                    String str11 = this.f28095l;
                                                    if (str11 == null) {
                                                        if (((i) abstractC2601a).f28095l == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(((i) abstractC2601a).f28095l)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21 = 0;
        Integer num = this.f28084a;
        if (num == null) {
            i10 = 0;
        } else {
            i10 = num.hashCode();
        }
        int i22 = (i10 ^ 1000003) * 1000003;
        String str = this.f28085b;
        if (str == null) {
            i11 = 0;
        } else {
            i11 = str.hashCode();
        }
        int i23 = (i22 ^ i11) * 1000003;
        String str2 = this.f28086c;
        if (str2 == null) {
            i12 = 0;
        } else {
            i12 = str2.hashCode();
        }
        int i24 = (i23 ^ i12) * 1000003;
        String str3 = this.f28087d;
        if (str3 == null) {
            i13 = 0;
        } else {
            i13 = str3.hashCode();
        }
        int i25 = (i24 ^ i13) * 1000003;
        String str4 = this.f28088e;
        if (str4 == null) {
            i14 = 0;
        } else {
            i14 = str4.hashCode();
        }
        int i26 = (i25 ^ i14) * 1000003;
        String str5 = this.f28089f;
        if (str5 == null) {
            i15 = 0;
        } else {
            i15 = str5.hashCode();
        }
        int i27 = (i26 ^ i15) * 1000003;
        String str6 = this.f28090g;
        if (str6 == null) {
            i16 = 0;
        } else {
            i16 = str6.hashCode();
        }
        int i28 = (i27 ^ i16) * 1000003;
        String str7 = this.f28091h;
        if (str7 == null) {
            i17 = 0;
        } else {
            i17 = str7.hashCode();
        }
        int i29 = (i28 ^ i17) * 1000003;
        String str8 = this.f28092i;
        if (str8 == null) {
            i18 = 0;
        } else {
            i18 = str8.hashCode();
        }
        int i30 = (i29 ^ i18) * 1000003;
        String str9 = this.f28093j;
        if (str9 == null) {
            i19 = 0;
        } else {
            i19 = str9.hashCode();
        }
        int i31 = (i30 ^ i19) * 1000003;
        String str10 = this.f28094k;
        if (str10 == null) {
            i20 = 0;
        } else {
            i20 = str10.hashCode();
        }
        int i32 = (i31 ^ i20) * 1000003;
        String str11 = this.f28095l;
        if (str11 != null) {
            i21 = str11.hashCode();
        }
        return i21 ^ i32;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.f28084a);
        sb2.append(", model=");
        sb2.append(this.f28085b);
        sb2.append(", hardware=");
        sb2.append(this.f28086c);
        sb2.append(", device=");
        sb2.append(this.f28087d);
        sb2.append(", product=");
        sb2.append(this.f28088e);
        sb2.append(", osBuild=");
        sb2.append(this.f28089f);
        sb2.append(", manufacturer=");
        sb2.append(this.f28090g);
        sb2.append(", fingerprint=");
        sb2.append(this.f28091h);
        sb2.append(", locale=");
        sb2.append(this.f28092i);
        sb2.append(", country=");
        sb2.append(this.f28093j);
        sb2.append(", mccMnc=");
        sb2.append(this.f28094k);
        sb2.append(", applicationBuild=");
        return R.a.t(sb2, this.f28095l, "}");
    }
}
