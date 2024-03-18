package com.revenuecat.purchases.utils;

import j$.util.Objects;
import java.util.function.Function;
import wf.k;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27752a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f27753b;

    public /* synthetic */ a(int i10, k kVar) {
        this.f27752a = i10;
        this.f27753b = kVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        int i10 = this.f27752a;
        return Objects.requireNonNull(function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i10 = this.f27752a;
        k kVar = this.f27753b;
        switch (i10) {
            case 0:
                return EventsFileHelper$readFile$1.a(obj, kVar);
            default:
                return EventsFileHelper$readFileAsJson$1.a(obj, kVar);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        int i10 = this.f27752a;
        return Objects.requireNonNull(function);
    }
}
