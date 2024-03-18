package k4;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: k4.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4169k extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C4170l f37015Y;

    /* renamed from: Z  reason: collision with root package name */
    public i4.m f37016Z;

    /* renamed from: h0  reason: collision with root package name */
    public Object f37017h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f37018i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C4170l f37019j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f37020k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4169k(C4170l c4170l, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f37019j0 = c4170l;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f37018i0 = obj;
        this.f37020k0 |= Integer.MIN_VALUE;
        return this.f37019j0.a(this);
    }
}
