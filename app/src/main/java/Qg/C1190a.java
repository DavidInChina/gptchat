package Qg;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: Qg.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1190a extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Rg.C f14809Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f14810Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C1209l f14811h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f14812i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1190a(C1209l c1209l, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f14811h0 = c1209l;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f14810Z = obj;
        this.f14812i0 |= Integer.MIN_VALUE;
        return this.f14811h0.b(null, this);
    }
}
