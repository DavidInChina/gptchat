package pe;

import nf.AbstractC4825e;
import pf.AbstractC5156c;
import xe.C6410O;

/* renamed from: pe.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5150b extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C5151c f43088Y;

    /* renamed from: Z  reason: collision with root package name */
    public C6410O f43089Z;

    /* renamed from: h0  reason: collision with root package name */
    public Wg.d f43090h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f43091i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C5151c f43092j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f43093k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5150b(C5151c c5151c, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f43092j0 = c5151c;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f43091i0 = obj;
        this.f43093k0 |= Integer.MIN_VALUE;
        return this.f43092j0.G0(null, this);
    }
}
