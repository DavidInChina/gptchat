package o9;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: o9.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4966n extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C4969q f41020Y;

    /* renamed from: Z  reason: collision with root package name */
    public Wg.a f41021Z;

    /* renamed from: h0  reason: collision with root package name */
    public C4969q f41022h0;

    /* renamed from: i0  reason: collision with root package name */
    public long f41023i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f41024j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ C4969q f41025k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f41026l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4966n(C4969q c4969q, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f41025k0 = c4969q;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f41024j0 = obj;
        this.f41026l0 |= Integer.MIN_VALUE;
        return this.f41025k0.a(this);
    }
}
