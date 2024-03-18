package xc;

import N.W;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: xc.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6395d extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f49797Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f49798Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ W f49799h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6395d(W w10, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f49799h0 = w10;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f49797Y = obj;
        this.f49798Z |= Integer.MIN_VALUE;
        return this.f49799h0.c(null, this);
    }
}
