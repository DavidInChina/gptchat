package d0;

import D1.N;
import D1.Z;
import android.view.View;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kf.t;
import kotlin.jvm.internal.o;

/* renamed from: d0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2564b extends o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f27818Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Collection f27819Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2564b(int i10, Collection collection) {
        super(1);
        this.f27818Y = i10;
        this.f27819Z = collection;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f27818Y;
        Collection<?> collection = this.f27819Z;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        return Boolean.valueOf(collection.contains(obj));
                    default:
                        return Boolean.valueOf(collection.contains(obj));
                }
            case 1:
                switch (i10) {
                    case 0:
                        return Boolean.valueOf(collection.contains(obj));
                    default:
                        return Boolean.valueOf(collection.contains(obj));
                }
            case 2:
                return Boolean.valueOf(((List) obj).retainAll(collection));
            default:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC3557B.c0("entry", entry);
                WeakHashMap weakHashMap = Z.f3247a;
                return Boolean.valueOf(t.X1(collection, N.k((View) entry.getValue())));
        }
    }
}
