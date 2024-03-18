package qb;

import Jc.F;
import Ra.l;
import Ta.p;
import android.net.Uri;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import kf.w;
import nf.AbstractC4825e;
import of.EnumC5000a;
import tb.g;
import tb.h;
import tb.i;
import wd.v0;

/* renamed from: qb.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5300b extends i {

    /* renamed from: j  reason: collision with root package name */
    public final F f44038j;

    public C5300b(F f6) {
        super(new h(w.f37484Y));
        this.f44038j = f6;
    }

    @Override // Ad.g
    public final void i(Ad.i iVar) {
        AbstractC2469q0.p(iVar);
        AbstractC3557B.c0("intent", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    @Override // tb.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(String str, String str2, String str3, AbstractC4825e abstractC4825e) {
        C5299a c5299a;
        int i10;
        C5300b c5300b;
        g gVar;
        if (abstractC4825e instanceof C5299a) {
            c5299a = (C5299a) abstractC4825e;
            int i11 = c5299a.f44037j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c5299a.f44037j0 = i11 - Integer.MIN_VALUE;
                Object obj = c5299a.f44035h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c5299a.f44037j0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        gVar = c5299a.f44034Z;
                        c5300b = c5299a.f44033Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    g gVar2 = new g(str, str2, str3);
                    v0 v0Var = (v0) ((h) e()).f46059a.get(gVar2);
                    if (v0Var != null) {
                        return v0Var;
                    }
                    String path = Uri.parse(str3).getPath();
                    if (path == null) {
                        path = "";
                    }
                    c5299a.f44033Y = this;
                    c5299a.f44034Z = gVar2;
                    c5299a.f44037j0 = 1;
                    Object a5 = ((p) this.f44038j).a(str, str2, path, c5299a);
                    if (a5 == enumC5000a) {
                        return enumC5000a;
                    }
                    c5300b = this;
                    obj = a5;
                    gVar = gVar2;
                }
                v0 v0Var2 = (v0) obj;
                c5300b.l(new l(gVar, v0Var2));
                return v0Var2;
            }
        }
        c5299a = new C5299a(this, abstractC4825e);
        Object obj2 = c5299a.f44035h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c5299a.f44037j0;
        if (i10 == 0) {
        }
        v0 v0Var22 = (v0) obj2;
        c5300b.l(new l(gVar, v0Var22));
        return v0Var22;
    }
}
