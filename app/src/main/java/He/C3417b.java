package he;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: he.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3417b extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C3418c f32263Y;

    /* renamed from: Z  reason: collision with root package name */
    public Je.a f32264Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f32265h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C3418c f32266i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f32267j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3417b(C3418c c3418c, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f32266i0 = c3418c;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f32265h0 = obj;
        this.f32267j0 |= Integer.MIN_VALUE;
        return this.f32266i0.a(null, this);
    }
}
