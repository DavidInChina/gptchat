package rb;

import android.location.Geocoder;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: rb.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5401B extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Geocoder f44649Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f44650Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C5402C f44651h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f44652i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5401B(C5402C c5402c, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f44651h0 = c5402c;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f44650Z = obj;
        this.f44652i0 |= Integer.MIN_VALUE;
        return this.f44651h0.b(this);
    }
}
