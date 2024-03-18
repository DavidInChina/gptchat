package o4;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kf.t;

/* loaded from: classes2.dex */
public final class k implements m {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f40598a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public int f40599b;

    @Override // o4.m
    public final synchronized d a(c cVar) {
        d dVar;
        try {
            ArrayList arrayList = (ArrayList) this.f40598a.get(cVar);
            d dVar2 = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                j jVar = (j) arrayList.get(i10);
                Bitmap bitmap = (Bitmap) jVar.f40595b.get();
                if (bitmap != null) {
                    dVar = new d(bitmap, jVar.f40596c);
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    dVar2 = dVar;
                    break;
                }
                i10++;
            }
            int i11 = this.f40599b;
            this.f40599b = i11 + 1;
            if (i11 >= 10) {
                c();
            }
            return dVar2;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // o4.m
    public final synchronized void b(int i10) {
        if (i10 >= 10 && i10 != 20) {
            c();
        }
    }

    public final void c() {
        Bitmap bitmap;
        WeakReference weakReference;
        this.f40599b = 0;
        Iterator it = this.f40598a.values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                j jVar = (j) t.h2(arrayList);
                if (jVar != null && (weakReference = jVar.f40595b) != null) {
                    bitmap = (Bitmap) weakReference.get();
                } else {
                    bitmap = null;
                }
                if (bitmap == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    int i12 = i11 - i10;
                    if (((j) arrayList.get(i12)).f40595b.get() == null) {
                        arrayList.remove(i12);
                        i10++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    @Override // o4.m
    public final synchronized void d(c cVar, Bitmap bitmap, Map map, int i10) {
        try {
            LinkedHashMap linkedHashMap = this.f40598a;
            Object obj = linkedHashMap.get(cVar);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(cVar, obj);
            }
            ArrayList arrayList = (ArrayList) obj;
            int identityHashCode = System.identityHashCode(bitmap);
            j jVar = new j(identityHashCode, new WeakReference(bitmap), map, i10);
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    j jVar2 = (j) arrayList.get(i11);
                    if (i10 >= jVar2.f40597d) {
                        if (jVar2.f40594a == identityHashCode && jVar2.f40595b.get() == bitmap) {
                            arrayList.set(i11, jVar);
                        } else {
                            arrayList.add(i11, jVar);
                        }
                    } else {
                        i11++;
                    }
                } else {
                    arrayList.add(jVar);
                    break;
                }
            }
            int i12 = this.f40599b;
            this.f40599b = i12 + 1;
            if (i12 >= 10) {
                c();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
