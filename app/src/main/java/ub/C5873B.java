package ub;

import G0.X;
import W.P0;
import W.R0;
import W.j4;
import Z.AbstractC1725n;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4323o;
import y.C6480s;

/* renamed from: ub.B  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5873B extends kotlin.jvm.internal.o implements wf.p {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ boolean f46511Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f46512Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5873B(int i10, boolean z10) {
        super(4);
        this.f46511Y = z10;
        this.f46512Z = i10;
    }

    @Override // wf.p
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        Y0.j jVar;
        String str = (String) obj2;
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj3;
        int intValue = ((Number) obj4).intValue();
        AbstractC3557B.c0("$this$AnimatedContent", (C6480s) obj);
        AbstractC3557B.c0(ParameterNames.TEXT, str);
        C4323o c4323o = C4323o.f37719b;
        AbstractC4326r a5 = AbstractC4194d.a((X) io.sentry.compose.b.a("ToolStatusCardInternal"), androidx.compose.foundation.layout.a.v(c4323o, 0.0f, 1, 0.0f, 0.0f, 13));
        if (this.f46511Y) {
            jVar = Y0.j.f22032c;
        } else {
            jVar = null;
        }
        int i10 = ((intValue >> 3) & 14) | 48;
        j4.b(str, a5, ((P0) ((Z.r) abstractC1725n).m(R0.f19593a)).f19535s, 0L, null, null, null, 0L, jVar, null, 0L, 2, false, this.f46512Z, 0, null, null, abstractC1725n, i10, 48, 120568);
        return jf.y.f36177a;
    }
}
