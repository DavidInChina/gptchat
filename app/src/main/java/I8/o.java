package I8;

import com.google.gson.reflect.TypeToken;
import j$.util.Objects;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final K8.f f8117a = K8.f.f9547h0;

    /* renamed from: b  reason: collision with root package name */
    public final int f8118b = 1;

    /* renamed from: c  reason: collision with root package name */
    public final C0739a f8119c = h.f8099Y;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f8120d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f8121e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f8122f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public String f8123g = null;

    /* renamed from: h  reason: collision with root package name */
    public final int f8124h = 2;

    /* renamed from: i  reason: collision with root package name */
    public final int f8125i = 2;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f8126j = true;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f8127k = true;

    /* renamed from: l  reason: collision with root package name */
    public D f8128l = C.f8095Y;

    /* renamed from: m  reason: collision with root package name */
    public final z f8129m = C.f8096Z;

    /* renamed from: n  reason: collision with root package name */
    public final LinkedList f8130n = new LinkedList();

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n a() {
        L8.x xVar;
        L8.x xVar2;
        int i10;
        ArrayList arrayList = this.f8121e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f8122f;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        String str = this.f8123g;
        boolean z10 = O8.e.f13435a;
        L8.d dVar = L8.e.f10788b;
        L8.x xVar3 = null;
        if (str != null && !str.trim().isEmpty()) {
            xVar = L8.A.a(Date.class, new com.auth0.android.request.internal.h(dVar, str, 0));
            if (z10) {
                O8.d dVar2 = O8.e.f13437c;
                dVar2.getClass();
                xVar3 = L8.A.a(dVar2.f10789a, new com.auth0.android.request.internal.h(dVar2, str, 0));
                O8.d dVar3 = O8.e.f13436b;
                dVar3.getClass();
                xVar2 = L8.A.a(dVar3.f10789a, new com.auth0.android.request.internal.h(dVar3, str, 0));
                arrayList3.add(xVar);
                if (z10) {
                }
            }
            xVar2 = null;
            arrayList3.add(xVar);
            if (z10) {
            }
        } else {
            int i11 = this.f8124h;
            if (i11 != 2 && (i10 = this.f8125i) != 2) {
                xVar = L8.A.a(Date.class, new com.auth0.android.request.internal.h(dVar, i11, i10, 0));
                if (z10) {
                    O8.d dVar4 = O8.e.f13437c;
                    dVar4.getClass();
                    xVar3 = L8.A.a(dVar4.f10789a, new com.auth0.android.request.internal.h(dVar4, i11, i10, 0));
                    O8.d dVar5 = O8.e.f13436b;
                    dVar5.getClass();
                    xVar2 = L8.A.a(dVar5.f10789a, new com.auth0.android.request.internal.h(dVar5, i11, i10, 0));
                    arrayList3.add(xVar);
                    if (z10) {
                        arrayList3.add(xVar3);
                        arrayList3.add(xVar2);
                    }
                }
                xVar2 = null;
                arrayList3.add(xVar);
                if (z10) {
                }
            }
        }
        C0739a c0739a = this.f8119c;
        HashMap hashMap = new HashMap(this.f8120d);
        int i12 = this.f8118b;
        new ArrayList(arrayList);
        new ArrayList(arrayList2);
        return new n(this.f8117a, c0739a, hashMap, this.f8126j, this.f8127k, i12, arrayList3, this.f8128l, this.f8129m, new ArrayList(this.f8130n));
    }

    public final void b(q qVar, Type type) {
        boolean z10;
        Objects.requireNonNull(type);
        ArrayList arrayList = this.f8121e;
        TypeToken<?> typeToken = TypeToken.get(type);
        if (typeToken.getType() == typeToken.getRawType()) {
            z10 = true;
        } else {
            z10 = false;
        }
        arrayList.add(new L8.u(qVar, typeToken, z10));
        if (qVar instanceof E) {
            L8.x xVar = L8.A.f10755a;
            arrayList.add(new L8.x(TypeToken.get(type), (E) qVar, 2));
        }
    }
}
