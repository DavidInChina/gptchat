package pc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: pc.w  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5143w extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f43039Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f43040Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C5144x f43041h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f43042i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5143w(C5144x c5144x, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f43041h0 = c5144x;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f43040Z = obj;
        this.f43042i0 |= Integer.MIN_VALUE;
        return this.f43041h0.c(null, null, this);
    }
}
