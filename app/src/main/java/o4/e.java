package o4;

import U3.u;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jf.C3959i;
import kf.AbstractC4268D;
import kf.w;
import q1.AbstractC5260f;
import q4.n;
import q4.q;
import r4.C5364a;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final f4.i f40584a;

    /* renamed from: b  reason: collision with root package name */
    public final u f40585b;

    public e(f4.i iVar, u uVar) {
        this.f40584a = iVar;
        this.f40585b = uVar;
    }

    public static q c(l4.l lVar, q4.j jVar, c cVar, d dVar) {
        String str;
        boolean z10;
        boolean z11;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(jVar.f43842a.getResources(), dVar.f40582a);
        h4.f fVar = h4.f.f31879Y;
        Map map = dVar.f40583b;
        Object obj = map.get("coil#disk_cache_key");
        Boolean bool = null;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        Object obj2 = map.get("coil#is_sampled");
        if (obj2 instanceof Boolean) {
            bool = (Boolean) obj2;
        }
        if (bool != null) {
            z10 = bool.booleanValue();
        } else {
            z10 = false;
        }
        Bitmap.Config[] configArr = u4.e.f46388a;
        if ((lVar instanceof l4.l) && lVar.f37829g) {
            z11 = true;
        } else {
            z11 = false;
        }
        return new q(bitmapDrawable, jVar, fVar, cVar, str, z10, z11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
        if (r7 != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
        r16 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
        if (id.AbstractC3557B.K(r2, r20.toString()) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00de, code lost:
        if (java.lang.Math.abs(r3 - (r10 * r4)) > 1.0d) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f2, code lost:
        if (java.lang.Math.abs(r9 - r2) > 1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fe, code lost:
        if (java.lang.Math.abs(r3 - r4) > 1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0103, code lost:
        if (r12 != 1.0d) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0106, code lost:
        if (r1 != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010b, code lost:
        if (r12 <= 1.0d) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010d, code lost:
        if (r7 == false) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d a(q4.j jVar, c cVar, r4.h hVar, r4.g gVar) {
        d dVar;
        Boolean bool;
        boolean z10;
        d dVar2;
        int i10;
        r4.g gVar2;
        int i11;
        double d10;
        if (!jVar.f43861t.f43751Y) {
            return null;
        }
        f fVar = (f) ((f4.q) this.f40584a).f29634c.getValue();
        if (fVar != null) {
            dVar = fVar.f40586a.a(cVar);
            if (dVar == null) {
                dVar = fVar.f40587b.a(cVar);
            }
        } else {
            dVar = null;
        }
        if (dVar != null) {
            Bitmap bitmap = dVar.f40582a;
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            this.f40585b.getClass();
            if (!R4.b.w1(config) || jVar.f43858q) {
                Object obj = dVar.f40583b.get("coil#is_sampled");
                if (obj instanceof Boolean) {
                    bool = (Boolean) obj;
                } else {
                    bool = null;
                }
                boolean z11 = false;
                if (bool != null) {
                    z10 = bool.booleanValue();
                } else {
                    z10 = false;
                }
                if (!AbstractC3557B.K(hVar, r4.h.f44440c)) {
                    String str = (String) cVar.f40581Z.get("coil#transformation_size");
                    if (str == null) {
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        AbstractC5260f abstractC5260f = hVar.f44441a;
                        if (abstractC5260f instanceof C5364a) {
                            i10 = ((C5364a) abstractC5260f).f44429h;
                        } else {
                            i10 = Integer.MAX_VALUE;
                        }
                        AbstractC5260f abstractC5260f2 = hVar.f44442b;
                        if (abstractC5260f2 instanceof C5364a) {
                            i11 = ((C5364a) abstractC5260f2).f44429h;
                            gVar2 = gVar;
                        } else {
                            gVar2 = gVar;
                            i11 = Integer.MAX_VALUE;
                        }
                        double a5 = h4.h.a(width, height, i10, i11, gVar2);
                        boolean a10 = u4.d.a(jVar);
                        if (a10) {
                            if (a5 > 1.0d) {
                                d10 = 1.0d;
                            } else {
                                d10 = a5;
                            }
                            dVar2 = dVar;
                            if (Math.abs(i10 - (width * d10)) > 1.0d) {
                            }
                        } else {
                            dVar2 = dVar;
                            if (i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE) {
                                z11 = true;
                            }
                            if (!z11) {
                            }
                            if (i11 != Integer.MIN_VALUE) {
                                if (i11 != Integer.MAX_VALUE) {
                                }
                            }
                        }
                    }
                }
                return dVar2;
            }
        }
        return null;
    }

    public final c b(q4.j jVar, Object obj, n nVar, f4.e eVar) {
        String str;
        Map map;
        c cVar = jVar.f43846e;
        if (cVar != null) {
            return cVar;
        }
        List list = ((f4.q) this.f40584a).f29639h.f29595c;
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                C3959i c3959i = (C3959i) list.get(i10);
                m4.b bVar = (m4.b) c3959i.f36155Y;
                if (((Class) c3959i.f36156Z).isAssignableFrom(obj.getClass())) {
                    AbstractC3557B.a0("null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>", bVar);
                    str = bVar.a(obj, nVar);
                    if (str != null) {
                        break;
                    }
                }
                i10++;
            } else {
                str = null;
                break;
            }
        }
        if (str == null) {
            return null;
        }
        Map map2 = jVar.f43832D.f43885Y;
        boolean isEmpty = map2.isEmpty();
        w wVar = w.f37484Y;
        if (isEmpty) {
            map = wVar;
        } else {
            map = new LinkedHashMap();
            Iterator it = map2.entrySet().iterator();
            if (it.hasNext()) {
                AbstractC2469q0.p(((Map.Entry) it.next()).getValue());
                throw null;
            }
        }
        List list2 = jVar.f43853l;
        if (list2.isEmpty() && map.isEmpty()) {
            return new c(str, wVar);
        }
        LinkedHashMap m12 = AbstractC4268D.m1(map);
        if (!list2.isEmpty()) {
            if (list2.size() <= 0) {
                m12.put("coil#transformation_size", nVar.f43872d.toString());
            } else {
                AbstractC2469q0.p(list2.get(0));
                throw null;
            }
        }
        return new c(str, m12);
    }
}
