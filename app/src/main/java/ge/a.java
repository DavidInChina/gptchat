package Ge;

import G.X;
import id.AbstractC3557B;
import j$.util.Objects;
import java.util.function.Function;
import wf.k;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f6327a;

    public /* synthetic */ a(X x10) {
        this.f6327a = x10;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Objects.requireNonNull(function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        k kVar = this.f6327a;
        AbstractC3557B.c0("$tmp0", kVar);
        return kVar.invoke(obj);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Objects.requireNonNull(function);
    }
}
