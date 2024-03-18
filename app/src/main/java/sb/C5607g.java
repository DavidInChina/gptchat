package sb;

import id.AbstractC3557B;
import java.util.List;
import r9.y;

/* renamed from: sb.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5607g extends kotlin.jvm.internal.k implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f45507Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5607g(int i10, j0.u uVar) {
        super(1, uVar, j0.u.class, "contains", "contains(Ljava/lang/Object;)Z", 0);
        this.f45507Y = i10;
        if (i10 != 1) {
        } else {
            super(1, uVar, y.class, "toggle", "toggle(Ljava/util/List;Ljava/lang/Object;)V", 1);
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        switch (this.f45507Y) {
            case 0:
                M9.l lVar = (M9.l) obj;
                AbstractC3557B.c0("p0", lVar);
                return Boolean.valueOf(((j0.u) this.receiver).contains(lVar));
            default:
                M9.l lVar2 = (M9.l) obj;
                AbstractC3557B.c0("p0", lVar2);
                List list = (List) this.receiver;
                AbstractC3557B.c0("<this>", list);
                if (list.contains(lVar2)) {
                    list.remove(lVar2);
                } else {
                    list.add(lVar2);
                }
                return jf.y.f36177a;
        }
    }
}
