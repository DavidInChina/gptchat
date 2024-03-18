package o0;

import jf.y;
import kotlin.jvm.internal.o;
import r0.I;
import r0.L;
import r0.x;

/* renamed from: o0.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4876k extends o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ float f40430Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ L f40431Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ boolean f40432h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ long f40433i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ long f40434j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4876k(float f6, L l10, boolean z10, long j6, long j10) {
        super(1);
        this.f40430Y = f6;
        this.f40431Z = l10;
        this.f40432h0 = z10;
        this.f40433i0 = j6;
        this.f40434j0 = j10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        I i10 = (I) ((x) obj);
        i10.h(i10.f44199x0.b() * this.f40430Y);
        i10.i(this.f40431Z);
        boolean z10 = i10.f44196u0;
        boolean z11 = this.f40432h0;
        if (z10 != z11) {
            i10.f44181Y |= 16384;
            i10.f44196u0 = z11;
        }
        i10.c(this.f40433i0);
        i10.j(this.f40434j0);
        return y.f36177a;
    }
}
