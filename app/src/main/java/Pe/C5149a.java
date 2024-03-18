package pe;

import nf.AbstractC4825e;
import pf.AbstractC5156c;
import xe.C6410O;
import xe.C6419h;

/* renamed from: pe.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5149a extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C5151c f43081Y;

    /* renamed from: Z  reason: collision with root package name */
    public C6410O f43082Z;

    /* renamed from: h0  reason: collision with root package name */
    public C6419h f43083h0;

    /* renamed from: i0  reason: collision with root package name */
    public Wg.d f43084i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f43085j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ C5151c f43086k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f43087l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5149a(C5151c c5151c, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f43086k0 = c5151c;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f43085j0 = obj;
        this.f43087l0 |= Integer.MIN_VALUE;
        return this.f43086k0.n0(null, null, this);
    }
}
