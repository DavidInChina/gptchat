package Ga;

import j$.util.Objects;
import java.util.function.BiConsumer;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements BiConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6254a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ wf.n f6255b;

    public y(z zVar, int i10) {
        this.f6254a = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                this.f6255b = zVar;
                return;
            } else {
                this.f6255b = zVar;
                return;
            }
        }
        this.f6255b = zVar;
    }

    @Override // java.util.function.BiConsumer
    public final /* synthetic */ void accept(Object obj, Object obj2) {
        int i10 = this.f6254a;
        wf.n nVar = this.f6255b;
        switch (i10) {
            case 0:
                nVar.invoke(obj, obj2);
                return;
            case 1:
                nVar.invoke(obj, obj2);
                return;
            default:
                nVar.invoke(obj, obj2);
                return;
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        int i10 = this.f6254a;
        return Objects.requireNonNull(biConsumer);
    }
}
