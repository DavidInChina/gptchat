package n9;

import b4.AbstractC2125f;
import com.google.android.gms.internal.play_billing.N;
import d4.C2595d;
import e4.C2801i;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import s3.r;

/* loaded from: classes.dex */
public final class n extends AbstractC2125f {

    /* renamed from: b  reason: collision with root package name */
    public final h f39693b;

    public n(C2801i c2801i, h hVar) {
        super(c2801i);
        this.f39693b = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, AbstractC4825e abstractC4825e) {
        k kVar;
        int i10;
        n nVar;
        if (abstractC4825e instanceof k) {
            kVar = (k) abstractC4825e;
            int i11 = kVar.f39687i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f39687i0 = i11 - Integer.MIN_VALUE;
                Object obj = kVar.f39685Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = kVar.f39687i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        nVar = kVar.f39684Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    C2595d a5 = ((C2801i) this.f25632a).a(new Integer(750218886), "DELETE\nFROM DBMessage\nWHERE conversationId = ?", new r(this, 14, str));
                    kVar.f39684Y = this;
                    kVar.f39687i0 = 1;
                    if (a5.f27991b == enumC5000a) {
                        return enumC5000a;
                    }
                    nVar = this;
                }
                nVar.a(750218886, C4723b.f39660j0);
                return y.f36177a;
            }
        }
        kVar = new k(this, abstractC4825e);
        Object obj2 = kVar.f39685Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = kVar.f39687i0;
        if (i10 == 0) {
        }
        nVar.a(750218886, C4723b.f39660j0);
        return y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(i iVar, AbstractC4825e abstractC4825e) {
        m mVar;
        int i10;
        n nVar;
        if (abstractC4825e instanceof m) {
            mVar = (m) abstractC4825e;
            int i11 = mVar.f39692i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                mVar.f39692i0 = i11 - Integer.MIN_VALUE;
                Object obj = mVar.f39690Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = mVar.f39692i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        nVar = mVar.f39689Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    C2595d a5 = ((C2801i) this.f25632a).a(new Integer(1180159107), "INSERT OR REPLACE\nINTO DBMessage (id, conversationId, messageNode)\nVALUES (?, ?, ?)", new r(this, 16, iVar));
                    mVar.f39689Y = this;
                    mVar.f39692i0 = 1;
                    if (a5.f27991b == enumC5000a) {
                        return enumC5000a;
                    }
                    nVar = this;
                }
                nVar.a(1180159107, C4723b.f39661k0);
                return y.f36177a;
            }
        }
        mVar = new m(this, abstractC4825e);
        Object obj2 = mVar.f39690Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = mVar.f39692i0;
        if (i10 == 0) {
        }
        nVar.a(1180159107, C4723b.f39661k0);
        return y.f36177a;
    }
}
