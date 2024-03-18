package lb;

import android.net.Uri;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: lb.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4371h extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public K f38002Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f38003Z;

    /* renamed from: h0  reason: collision with root package name */
    public Uri f38004h0;

    /* renamed from: i0  reason: collision with root package name */
    public Jc.F f38005i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f38006j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ K f38007k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f38008l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4371h(K k10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f38007k0 = k10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f38006j0 = obj;
        this.f38008l0 |= Integer.MIN_VALUE;
        return this.f38007k0.r(null, null, this);
    }
}
