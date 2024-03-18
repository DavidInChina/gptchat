package G6;

import Mf.AbstractC0994c;
import android.util.Log;
import id.AbstractC3557B;
import java.util.Collection;
import kf.v;
import rg.AbstractC5493d;
import u4.h;

/* loaded from: classes.dex */
public final class a implements Ig.a, Di.b, h {

    /* renamed from: Y  reason: collision with root package name */
    public boolean f6064Y;

    public /* synthetic */ a(boolean z10) {
        this.f6064Y = z10;
    }

    @Override // u4.h
    public boolean a(r4.h hVar) {
        return this.f6064Y;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d8  */
    @Override // Di.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Di.a b(int i10, int i11, CharSequence charSequence) {
        int i12;
        boolean z10;
        int i13 = -1;
        boolean z11 = true;
        for (int i14 = i10 - 1; i14 >= i11; i14--) {
            char charAt = charSequence.charAt(i14);
            if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && ((charAt < '0' || charAt > '9') && charAt < '\u0080' && charAt != '!' && charAt != '-' && charAt != '/' && charAt != '=' && charAt != '?' && charAt != '*' && charAt != '+'))) {
                switch (charAt) {
                    case '#':
                    case '$':
                    case '%':
                    case '&':
                    case '\'':
                        break;
                    default:
                        switch (charAt) {
                            case '^':
                            case '_':
                            case '`':
                                break;
                            default:
                                switch (charAt) {
                                    case '{':
                                    case '|':
                                    case '}':
                                    case '~':
                                        break;
                                    default:
                                        if (charAt == '.' && !z11) {
                                            z11 = true;
                                            continue;
                                            continue;
                                            continue;
                                        }
                                        if (i13 != -1) {
                                            return null;
                                        }
                                        int i15 = -1;
                                        int i16 = -1;
                                        int i17 = i10 + 1;
                                        boolean z12 = true;
                                        boolean z13 = false;
                                        while (i17 < charSequence.length()) {
                                            char charAt2 = charSequence.charAt(i17);
                                            if (z12) {
                                                if ((charAt2 >= 'A' && charAt2 <= 'Z') || ((charAt2 >= 'a' && charAt2 <= 'z') || ((charAt2 >= '0' && charAt2 <= '9') || charAt2 >= '\u0080'))) {
                                                    i15 = i17;
                                                    i12 = i16;
                                                    z12 = false;
                                                    z10 = true;
                                                } else {
                                                    if (this.f6064Y && (i16 == -1 || i16 > i15)) {
                                                        i15 = -1;
                                                    }
                                                    if (i15 != -1) {
                                                        return null;
                                                    }
                                                    return new Di.a(Ci.c.f3173Z, i13, i15 + 1);
                                                }
                                            } else if (charAt2 == '.') {
                                                if (z13) {
                                                    if (i16 == -1) {
                                                        z10 = z13;
                                                        i12 = i17;
                                                        z12 = true;
                                                    } else {
                                                        i12 = i16;
                                                        z12 = true;
                                                        z10 = z13;
                                                    }
                                                } else {
                                                    if (this.f6064Y) {
                                                        i15 = -1;
                                                    }
                                                    if (i15 != -1) {
                                                    }
                                                }
                                            } else if (charAt2 == '-') {
                                                i12 = i16;
                                                z10 = false;
                                            } else {
                                                if ((charAt2 < 'A' || charAt2 > 'Z') && ((charAt2 < 'a' || charAt2 > 'z') && (charAt2 < '0' || charAt2 > '9'))) {
                                                    if (charAt2 < '\u0080') {
                                                        if (this.f6064Y) {
                                                        }
                                                        if (i15 != -1) {
                                                        }
                                                    }
                                                }
                                                i15 = i17;
                                                i12 = i16;
                                                z10 = true;
                                            }
                                            i17++;
                                            z13 = z10;
                                            i16 = i12;
                                        }
                                        if (this.f6064Y) {
                                        }
                                        if (i15 != -1) {
                                        }
                                        break;
                                }
                        }
                }
            }
            i13 = i14;
            z11 = false;
        }
        if (i13 != -1) {
        }
    }

    @Override // Ig.a
    public Iterable c(Object obj) {
        boolean z10 = this.f6064Y;
        AbstractC0994c abstractC0994c = (AbstractC0994c) obj;
        int i10 = AbstractC5493d.f44985a;
        Collection collection = null;
        if (z10) {
            if (abstractC0994c != null) {
                abstractC0994c = abstractC0994c.mo24a();
            } else {
                abstractC0994c = null;
            }
        }
        if (abstractC0994c != null) {
            collection = abstractC0994c.m();
        }
        if (collection == null) {
            return v.f37483Y;
        }
        return collection;
    }

    @Override // u4.h
    public boolean d() {
        return this.f6064Y;
    }

    public void e(String str, String str2) {
        AbstractC3557B.c0("message", str2);
        if (this.f6064Y) {
            Log.d("AS/".concat(str), str2);
        }
    }
}
