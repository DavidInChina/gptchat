package Zd;

/* loaded from: classes2.dex */
public final class a implements Comparable {

    /* renamed from: Y  reason: collision with root package name */
    public final String f23692Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Integer f23693Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Integer f23694h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Integer f23695i0;

    /* renamed from: j0  reason: collision with root package name */
    public final String[] f23696j0;

    /* renamed from: k0  reason: collision with root package name */
    public final String f23697k0;

    public a(String str) {
        String[] strArr;
        String str2;
        String[] strArr2;
        char c10;
        String str3;
        String trim = str.trim();
        this.f23692Y = trim;
        int indexOf = trim.indexOf("+");
        int indexOf2 = trim.indexOf("-");
        if (indexOf2 == -1 || (indexOf != -1 && indexOf2 >= indexOf)) {
            strArr = new String[]{trim};
        } else {
            strArr = trim.split("-", 2);
        }
        try {
            if (strArr.length == 1) {
                if (!strArr[0].endsWith("+")) {
                    String[] split = strArr[0].split("\\+");
                    strArr2 = split[0].split("\\.");
                    if (split.length == 2) {
                        str3 = split[1];
                    } else {
                        str3 = null;
                    }
                    str2 = str3;
                    c10 = 0;
                } else {
                    throw new RuntimeException("The build cannot be empty.");
                }
            } else {
                c10 = 0;
                strArr2 = strArr[0].split("\\.");
                str2 = null;
            }
            try {
                this.f23693Z = Integer.valueOf(strArr2[c10]);
                try {
                    Integer valueOf = Integer.valueOf(strArr2[1]);
                    try {
                        Integer valueOf2 = Integer.valueOf(strArr2[2]);
                        this.f23694h0 = valueOf;
                        this.f23695i0 = valueOf2;
                        String[] strArr3 = new String[0];
                        if (!strArr[1].endsWith("+")) {
                            String[] split2 = strArr[1].split("\\+");
                            if (split2.length == 2) {
                                strArr3 = split2[0].split("\\.");
                                str2 = split2[1];
                            } else {
                                strArr3 = strArr[1].split("\\.");
                            }
                            this.f23696j0 = strArr3;
                            this.f23697k0 = str2;
                            Integer num = this.f23694h0;
                            String str4 = this.f23692Y;
                            if (num != null) {
                                if (this.f23695i0 != null) {
                                    return;
                                }
                                throw new RuntimeException(R.a.r("Invalid version (no patch version): ", str4));
                            }
                            throw new RuntimeException(R.a.r("Invalid version (no minor version): ", str4));
                        }
                        throw new RuntimeException("The build cannot be empty.");
                    } catch (IndexOutOfBoundsException unused) {
                        throw new RuntimeException("Invalid version (no patch version): ".concat(trim));
                    } catch (NumberFormatException unused2) {
                        throw new RuntimeException("Invalid version (no patch version): ".concat(trim));
                    }
                } catch (IndexOutOfBoundsException unused3) {
                    throw new RuntimeException("Invalid version (no minor version): ".concat(trim));
                } catch (NumberFormatException unused4) {
                    throw new RuntimeException("Invalid version (no minor version): ".concat(trim));
                }
            } catch (IndexOutOfBoundsException unused5) {
                throw new RuntimeException("Invalid version (no major version): ".concat(trim));
            } catch (NumberFormatException unused6) {
                throw new RuntimeException("Invalid version (no major version): ".concat(trim));
            }
        } catch (IndexOutOfBoundsException unused7) {
            throw new RuntimeException("The version is invalid: ".concat(trim));
        } catch (NumberFormatException unused8) {
            throw new RuntimeException("The version is invalid: ".concat(trim));
        }
    }

    /* renamed from: a */
    public final int compareTo(a aVar) {
        a aVar2;
        if (b(aVar)) {
            return 1;
        }
        if (!b(aVar)) {
            String str = this.f23697k0;
            if (str == null) {
                aVar2 = this;
            } else {
                aVar2 = new a(this.f23692Y.replace("+".concat(str), ""));
            }
            String str2 = aVar.f23697k0;
            if (str2 != null) {
                aVar = new a(aVar.f23692Y.replace("+".concat(str2), ""));
            }
            if (!aVar2.equals(aVar)) {
                return -1;
            }
            return 0;
        }
        return 0;
    }

    public final boolean b(a aVar) {
        int i10;
        int i11;
        int i12;
        Integer num = this.f23693Z;
        if (num.intValue() > aVar.f23693Z.intValue()) {
            return true;
        }
        if (num.intValue() < aVar.f23693Z.intValue()) {
            return false;
        }
        Integer num2 = aVar.f23694h0;
        if (num2 != null) {
            i10 = num2.intValue();
        } else {
            i10 = 0;
        }
        Integer num3 = this.f23694h0;
        if (num3 != null && num3.intValue() > i10) {
            return true;
        }
        if (num3 != null && num3.intValue() < i10) {
            return false;
        }
        Integer num4 = aVar.f23695i0;
        if (num4 != null) {
            i11 = num4.intValue();
        } else {
            i11 = 0;
        }
        Integer num5 = this.f23695i0;
        if (num5 != null && num5.intValue() > i11) {
            return true;
        }
        if (num5 != null && num5.intValue() < i11) {
            return false;
        }
        String[] strArr = this.f23696j0;
        int length = strArr.length;
        String[] strArr2 = aVar.f23696j0;
        if (length == 0 && strArr2.length > 0) {
            return true;
        }
        if (strArr2.length == 0 && strArr.length > 0) {
            return false;
        }
        for (int i13 = 0; i13 < strArr.length && i13 < strArr2.length; i13++) {
            try {
                i12 = Integer.valueOf(strArr[i13]).intValue() - Integer.valueOf(strArr2[i13]).intValue();
            } catch (NumberFormatException unused) {
                i12 = strArr[i13].compareToIgnoreCase(strArr2[i13]);
            }
            if (i12 < 0) {
                return false;
            }
            if (i12 > 0) {
                return true;
            }
        }
        if (strArr.length > strArr2.length) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f23692Y.equals(((a) obj).f23692Y);
    }

    public final int hashCode() {
        return this.f23692Y.hashCode();
    }

    public final String toString() {
        return this.f23692Y;
    }
}
