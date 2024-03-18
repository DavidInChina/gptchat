package hd;

import com.google.android.gms.internal.play_billing.N;
import io.sentry.L0;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wd.C6189g;
import wd.C6205s;
import wd.EnumC6187f;
import wd.EnumC6198k0;
import wf.n;

/* renamed from: hd.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3408b extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f32244Y;

    /* JADX WARN: Type inference failed for: r0v0, types: [hd.b, pf.j, nf.e] */
    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        ?? abstractC5163j = new AbstractC5163j(2, abstractC4825e);
        abstractC5163j.f32244Y = obj;
        return abstractC5163j;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((C3408b) create((C6205s) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [io.sentry.protocol.C, java.lang.Object] */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        EnumC6187f enumC6187f;
        String name;
        EnumC6198k0 enumC6198k0;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        C6205s c6205s = (C6205s) this.f32244Y;
        ?? obj2 = new Object();
        obj2.f34471Z = c6205s.f48458b.f48352a;
        String a5 = c6205s.a();
        Boolean bool = null;
        if (a5 == null) {
            a5 = null;
        }
        obj2.f34472h0 = a5;
        L0.i(obj2);
        L0.h("isEmployee", String.valueOf(Lg.n.c2(c6205s.f48458b.f48353b, "@openai.com", false)));
        boolean e10 = c6205s.e();
        C6189g c6189g = c6205s.f48457a;
        if (e10 && c6189g != null) {
            str = c6189g.f48410a;
        } else {
            str = null;
        }
        if (str == null) {
            str = null;
        }
        String str4 = "unknown";
        if (str == null) {
            str = str4;
        }
        L0.h("workspaceId", str);
        if (c6189g != null) {
            bool = Boolean.valueOf(c6189g.a());
        }
        L0.h("hasActiveSubscription", String.valueOf(bool));
        if (c6189g == null || (enumC6198k0 = c6189g.f48416g) == null || (str2 = enumC6198k0.f48437Y) == null) {
            str2 = str4;
        }
        L0.h("planType", str2);
        if (c6189g == null || (str3 = Boolean.valueOf(c6189g.f48417h).toString()) == null) {
            str3 = str4;
        }
        L0.h("isDeactivated", str3);
        if (c6189g != null && (enumC6187f = c6189g.f48414e) != null && (name = enumC6187f.name()) != null) {
            str4 = name;
        }
        L0.h("structure", str4);
        return y.f36177a;
    }
}
