package Z1;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: Z1.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1766i extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C1771m f22975Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f22976Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C1771m f22977h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f22978i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1766i(C1771m c1771m, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f22977h0 = c1771m;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f22976Z = obj;
        this.f22978i0 |= Integer.MIN_VALUE;
        return this.f22977h0.b(null, null, this);
    }
}
