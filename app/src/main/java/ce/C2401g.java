package ce;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: ce.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2401g implements AbstractC2397c {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f26599c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final List f26600a;

    /* renamed from: b  reason: collision with root package name */
    public final List f26601b;

    static {
        C2398d.a(Collections.emptySet());
    }

    public C2401g(List list, List list2) {
        this.f26600a = list;
        this.f26601b = list2;
    }

    @Override // p000if.a
    public final Object get() {
        int i10;
        List list = this.f26600a;
        int size = list.size();
        List list2 = this.f26601b;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Collection collection = (Collection) ((AbstractC2400f) list2.get(i11)).get();
            size += collection.size();
            arrayList.add(collection);
        }
        if (size < 3) {
            i10 = size + 1;
        } else if (size < 1073741824) {
            i10 = (int) ((size / 0.75f) + 1.0f);
        } else {
            i10 = Integer.MAX_VALUE;
        }
        HashSet hashSet = new HashSet(i10);
        int size3 = list.size();
        for (int i12 = 0; i12 < size3; i12++) {
            Object obj = ((AbstractC2400f) list.get(i12)).get();
            obj.getClass();
            hashSet.add(obj);
        }
        int size4 = arrayList.size();
        for (int i13 = 0; i13 < size4; i13++) {
            for (Object obj2 : (Collection) arrayList.get(i13)) {
                obj2.getClass();
                hashSet.add(obj2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
