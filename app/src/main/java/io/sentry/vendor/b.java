package io.sentry.vendor;

import I5.h;
import Nh.l;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import io.sentry.android.core.z;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f34786a;

    /* renamed from: b  reason: collision with root package name */
    public final int f34787b;

    /* renamed from: c  reason: collision with root package name */
    public Object f34788c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(int i10, int i11) {
        this(i10, (b) null);
        this.f34786a = i11;
        if (i11 == 2) {
            this(i10, (b) null, 0);
        } else if (i11 == 3) {
            this(i10, (b) null, (Object) null);
        } else if (i11 == 4) {
            this(i10, (b) null, (AbstractC2469q0) null);
        } else if (i11 != 5) {
        } else {
            this(i10, (b) null, (a) null);
        }
    }

    public void a(int i10, int i11, String str, String str2, String str3, String[] strArr) {
        if (this.f34787b < 524288 && (65536 & i11) != 0) {
            throw new UnsupportedOperationException("Records requires ASM8");
        }
        Object obj = this.f34788c;
        if (((b) obj) != null) {
            ((b) obj).a(i10, i11, str, str2, str3, strArr);
        }
    }

    public void b(String str, Object obj) {
        Object obj2 = this.f34788c;
        if (((b) obj2) != null) {
            ((b) obj2).b(str, obj);
        }
    }

    public b c(String str, String str2) {
        Object obj = this.f34788c;
        if (((b) obj) != null) {
            return ((b) obj).c(str, str2);
        }
        return null;
    }

    public b d(String str, boolean z10) {
        switch (this.f34786a) {
            case 2:
                b bVar = (b) this.f34788c;
                if (bVar == null) {
                    return null;
                }
                return bVar.d(str, z10);
            case 3:
                b bVar2 = (b) this.f34788c;
                if (bVar2 == null) {
                    return null;
                }
                return bVar2.d(str, z10);
            default:
                b bVar3 = (b) this.f34788c;
                if (bVar3 == null) {
                    return null;
                }
                return bVar3.d(str, z10);
        }
    }

    public b e(String str) {
        Object obj = this.f34788c;
        if (((b) obj) != null) {
            return ((b) obj).e(str);
        }
        return null;
    }

    public void f(z zVar) {
        switch (this.f34786a) {
            case 2:
                b bVar = (b) this.f34788c;
                if (bVar != null) {
                    bVar.f(zVar);
                    return;
                }
                return;
            case 3:
                b bVar2 = (b) this.f34788c;
                if (bVar2 != null) {
                    bVar2.f(zVar);
                    return;
                }
                return;
            default:
                b bVar3 = (b) this.f34788c;
                if (bVar3 != null) {
                    bVar3.f(zVar);
                    return;
                }
                return;
        }
    }

    public void g() {
        switch (this.f34786a) {
            case 1:
                b bVar = (b) this.f34788c;
                if (bVar != null) {
                    bVar.g();
                    return;
                }
                return;
            case 2:
                b bVar2 = (b) this.f34788c;
                if (bVar2 != null) {
                    bVar2.g();
                    return;
                }
                return;
            case 3:
                b bVar3 = (b) this.f34788c;
                if (bVar3 != null) {
                    bVar3.g();
                    return;
                }
                return;
            case 4:
                b bVar4 = (b) this.f34788c;
                if (bVar4 != null) {
                    bVar4.g();
                    return;
                }
                return;
            default:
                b bVar5 = (b) this.f34788c;
                if (bVar5 != null) {
                    bVar5.g();
                    return;
                }
                return;
        }
    }

    public void h(String str, String str2, String str3) {
        Object obj = this.f34788c;
        if (((b) obj) != null) {
            ((b) obj).h(str, str2, str3);
        }
    }

    public void i(String str, int i10, String... strArr) {
        Object obj = this.f34788c;
        if (((b) obj) != null) {
            ((b) obj).i(str, i10, strArr);
        }
    }

    public b j(int i10, Object obj, String str, String str2, String str3) {
        Object obj2 = this.f34788c;
        if (((b) obj2) != null) {
            return ((b) obj2).j(i10, obj, str, str2, str3);
        }
        return null;
    }

    public void k(String str, int i10, String str2, String str3) {
        Object obj = this.f34788c;
        if (((b) obj) != null) {
            ((b) obj).k(str, i10, str2, str3);
        }
    }

    public void l(String str) {
        Object obj = this.f34788c;
        if (((b) obj) != null) {
            ((b) obj).l(str);
        }
    }

    public l m(int i10, String str, String str2, String str3, String[] strArr) {
        Object obj = this.f34788c;
        if (((b) obj) != null) {
            return ((b) obj).m(i10, str, str2, str3, strArr);
        }
        return null;
    }

    public b n(int i10, String str, String str2) {
        if (this.f34787b >= 393216) {
            Object obj = this.f34788c;
            if (((b) obj) != null) {
                return ((b) obj).n(i10, str, str2);
            }
            return null;
        }
        throw new UnsupportedOperationException("Module requires ASM6");
    }

    public void o(String str) {
        if (this.f34787b >= 458752) {
            Object obj = this.f34788c;
            if (((b) obj) != null) {
                ((b) obj).o(str);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("NestHost requires ASM7");
    }

    public void p(String str) {
        if (this.f34787b >= 458752) {
            Object obj = this.f34788c;
            if (((b) obj) != null) {
                ((b) obj).p(str);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("NestMember requires ASM7");
    }

    public void q(String str, int i10, String... strArr) {
        Object obj = this.f34788c;
        if (((b) obj) != null) {
            ((b) obj).q(str, i10, strArr);
        }
    }

    public void r(String str, String str2, String str3) {
        Object obj = this.f34788c;
        if (((b) obj) != null) {
            ((b) obj).r(str, str2, str3);
        }
    }

    public void s(String str) {
        Object obj = this.f34788c;
        if (((b) obj) != null) {
            ((b) obj).s(str);
        }
    }

    public void t(String str) {
        if (this.f34787b >= 589824) {
            Object obj = this.f34788c;
            if (((b) obj) != null) {
                ((b) obj).t(str);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("PermittedSubclasses requires ASM9");
    }

    public void u(String str, String... strArr) {
        b bVar = (b) this.f34788c;
        if (bVar != null) {
            bVar.u(str, strArr);
        }
    }

    public b v(String str, String str2, String str3) {
        if (this.f34787b >= 524288) {
            Object obj = this.f34788c;
            if (((b) obj) != null) {
                return ((b) obj).v(str, str2, str3);
            }
            return null;
        }
        throw new UnsupportedOperationException("Record requires ASM8");
    }

    public void w(int i10, String str, String str2) {
        Object obj = this.f34788c;
        if (((b) obj) != null) {
            ((b) obj).w(i10, str, str2);
        }
    }

    public void x(String str, String str2) {
        Object obj = this.f34788c;
        if (((b) obj) != null) {
            ((b) obj).x(str, str2);
        }
    }

    public b y(int i10, h hVar, String str, boolean z10) {
        switch (this.f34786a) {
            case 2:
                if (this.f34787b >= 327680) {
                    b bVar = (b) this.f34788c;
                    if (bVar == null) {
                        return null;
                    }
                    return bVar.y(i10, hVar, str, z10);
                }
                throw new UnsupportedOperationException("TypeAnnotation requires ASM5");
            case 3:
                if (this.f34787b >= 327680) {
                    b bVar2 = (b) this.f34788c;
                    if (bVar2 == null) {
                        return null;
                    }
                    return bVar2.y(i10, hVar, str, z10);
                }
                throw new UnsupportedOperationException("This feature requires ASM5");
            default:
                b bVar3 = (b) this.f34788c;
                if (bVar3 == null) {
                    return null;
                }
                return bVar3.y(i10, hVar, str, z10);
        }
    }

    public void z(String str) {
        Object obj = this.f34788c;
        if (((b) obj) != null) {
            ((b) obj).z(str);
        }
    }

    public b(int i10, b bVar, Object obj) {
        this.f34786a = 3;
        if (i10 != 589824 && i10 != 524288 && i10 != 458752 && i10 != 393216 && i10 != 327680 && i10 != 262144 && i10 != 17432576) {
            throw new IllegalArgumentException(android.gov.nist.core.a.e("Unsupported api ", i10));
        }
        if (i10 == 17432576) {
            Bi.c.B0(this);
        }
        this.f34787b = i10;
        this.f34788c = bVar;
    }

    public b(int i10, b bVar, AbstractC2469q0 abstractC2469q0) {
        this.f34786a = 4;
        if (i10 != 589824 && i10 != 524288 && i10 != 458752 && i10 != 393216 && i10 != 327680 && i10 != 262144 && i10 != 17432576) {
            throw new IllegalArgumentException(android.gov.nist.core.a.e("Unsupported api ", i10));
        }
        if (i10 == 17432576) {
            Bi.c.B0(this);
        }
        this.f34787b = i10;
        this.f34788c = bVar;
    }

    public b(int i10, b bVar, a aVar) {
        this.f34786a = 5;
        if (i10 != 589824 && i10 != 524288 && i10 != 458752 && i10 != 393216 && i10 != 327680 && i10 != 262144 && i10 != 17432576) {
            throw new IllegalArgumentException(android.gov.nist.core.a.e("Unsupported api ", i10));
        }
        if (i10 == 17432576) {
            Bi.c.B0(this);
        }
        this.f34787b = i10;
        this.f34788c = bVar;
    }

    public b(int i10, b bVar, int i11) {
        this.f34786a = 2;
        if (i10 != 589824 && i10 != 524288 && i10 != 458752 && i10 != 393216 && i10 != 327680 && i10 != 262144 && i10 != 17432576) {
            throw new IllegalArgumentException(android.gov.nist.core.a.e("Unsupported api ", i10));
        }
        if (i10 == 17432576) {
            Bi.c.B0(this);
        }
        this.f34787b = i10;
        this.f34788c = bVar;
    }

    public b(int i10, b bVar) {
        this.f34786a = 1;
        if (i10 != 589824 && i10 != 524288 && i10 != 458752 && i10 != 393216 && i10 != 327680 && i10 != 262144 && i10 != 17432576) {
            throw new IllegalArgumentException(android.gov.nist.core.a.e("Unsupported api ", i10));
        }
        if (i10 == 17432576) {
            Bi.c.B0(this);
        }
        this.f34787b = i10;
        this.f34788c = bVar;
    }
}
