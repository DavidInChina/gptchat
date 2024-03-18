package eg;

import android.gov.nist.javax.sip.header.ParameterNames;
import dg.y;
import dg.z;
import kg.C4290b;
import kg.C4294f;
import pg.C5169f;

/* renamed from: eg.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2896d implements y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29390a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C2898f f29391b;

    public /* synthetic */ C2896d(C2898f c2898f, int i10) {
        this.f29390a = i10;
        this.f29391b = c2898f;
    }

    @Override // dg.y
    public final y b(C4290b c4290b, C4294f c4294f) {
        int i10 = this.f29390a;
        return null;
    }

    @Override // dg.y
    public final void c(C4294f c4294f, C5169f c5169f) {
        int i10 = this.f29390a;
    }

    @Override // dg.y
    public final z d(C4294f c4294f) {
        switch (this.f29390a) {
            case 0:
                String b10 = c4294f.b();
                if ("d1".equals(b10)) {
                    return new C2895c(this, 0);
                }
                if (!"d2".equals(b10)) {
                    return null;
                }
                return new C2895c(this, 1);
            case 1:
                if (!"b".equals(c4294f.b())) {
                    return null;
                }
                return new C2895c(this, 2);
            default:
                String b11 = c4294f.b();
                if (!"data".equals(b11) && !"filePartClassNames".equals(b11)) {
                    if (!"strings".equals(b11)) {
                        return null;
                    }
                    return new C2897e(this, 1);
                }
                return new C2897e(this, 0);
        }
    }

    @Override // dg.y
    public final void e(C4294f c4294f, C4290b c4290b, C4294f c4294f2) {
        int i10 = this.f29390a;
    }

    @Override // dg.y
    public final void f(Object obj, C4294f c4294f) {
        String str;
        int i10 = this.f29390a;
        C2898f c2898f = this.f29391b;
        switch (i10) {
            case 0:
                String b10 = c4294f.b();
                if ("k".equals(b10)) {
                    if (obj instanceof Integer) {
                        EnumC2893a.f29377Z.getClass();
                        EnumC2893a enumC2893a = (EnumC2893a) EnumC2893a.f29378h0.get((Integer) obj);
                        if (enumC2893a == null) {
                            enumC2893a = EnumC2893a.f29379i0;
                        }
                        c2898f.f29403h = enumC2893a;
                        return;
                    }
                    return;
                } else if ("mv".equals(b10)) {
                    if (obj instanceof int[]) {
                        c2898f.f29396a = (int[]) obj;
                        return;
                    }
                    return;
                } else if ("xs".equals(b10)) {
                    if (obj instanceof String) {
                        String str2 = (String) obj;
                        if (!str2.isEmpty()) {
                            c2898f.f29397b = str2;
                            return;
                        }
                        return;
                    }
                    return;
                } else if ("xi".equals(b10)) {
                    if (obj instanceof Integer) {
                        c2898f.f29398c = ((Integer) obj).intValue();
                        return;
                    }
                    return;
                } else if ("pn".equals(b10) && (obj instanceof String)) {
                    String str3 = (String) obj;
                    if (!str3.isEmpty()) {
                        c2898f.f29399d = str3;
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 1:
                return;
            default:
                String b11 = c4294f.b();
                if (ParameterNames.VERSION.equals(b11)) {
                    if (obj instanceof int[]) {
                        c2898f.f29396a = (int[]) obj;
                        return;
                    }
                    return;
                } else if ("multifileClassName".equals(b11)) {
                    if (obj instanceof String) {
                        str = (String) obj;
                    } else {
                        str = null;
                    }
                    c2898f.f29397b = str;
                    return;
                } else {
                    return;
                }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2896d(C2898f c2898f, int i10, int i11) {
        this(c2898f, 0);
        this.f29390a = i10;
        if (i10 == 1) {
            this(c2898f, 1);
        } else if (i10 != 2) {
        } else {
            this(c2898f, 2);
        }
    }

    @Override // dg.y
    public final void a() {
    }
}
