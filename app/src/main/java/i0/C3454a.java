package i0;

import java.util.ArrayList;
import java.util.List;

/* renamed from: i0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3454a extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ wf.n f32393Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3454a(wf.n nVar) {
        super(2);
        this.f32393Y = nVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        m mVar;
        d dVar = (d) obj;
        List list = (List) this.f32393Y.invoke(dVar, obj2);
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj3 = list.get(i10);
            if (obj3 != null && (mVar = dVar.f32403Z) != null && !mVar.a(obj3)) {
                throw new IllegalArgumentException("item can't be saved".toString());
            }
        }
        if (!list.isEmpty()) {
            return new ArrayList(list);
        }
        return null;
    }
}
