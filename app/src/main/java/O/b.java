package O;

import Z.m1;
import kotlin.jvm.internal.o;
import r0.r;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class b extends o implements AbstractC6216a {

    /* renamed from: Z  reason: collision with root package name */
    public static final b f13237Z = new b(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final b f13238h0 = new b(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final b f13239i0 = new b(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final b f13240j0 = new b(3);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f13241Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10) {
        super(0);
        this.f13241Y = i10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        switch (this.f13241Y) {
            case 0:
                m1 m1Var = c.f13242a;
                long c10 = androidx.compose.ui.graphics.a.c(4284612846L);
                long c11 = androidx.compose.ui.graphics.a.c(4281794739L);
                long c12 = androidx.compose.ui.graphics.a.c(4278442694L);
                long c13 = androidx.compose.ui.graphics.a.c(4278290310L);
                long j6 = r.f44258f;
                long c14 = androidx.compose.ui.graphics.a.c(4289724448L);
                long j10 = r.f44254b;
                return new a(c10, c11, c12, c13, j6, j6, c14, j6, j10, j10, j10, j6);
            case 1:
                return new r(r.f44254b);
            case 2:
                return new Z0.e(0);
            default:
                return e.f13244a;
        }
    }
}
