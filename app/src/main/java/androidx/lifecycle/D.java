package androidx.lifecycle;

import K4.C0813a;
import android.gov.nist.core.Separators;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import id.AbstractC3557B;
import io.sentry.EnumC3652i;
import io.sentry.android.core.AbstractC3612c;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import kf.AbstractC4268D;
import y3.AbstractC6540b;

/* loaded from: classes2.dex */
public final class D implements T6.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25289a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f25290b;

    public D(int i10) {
        io.sentry.clientreport.d[] values;
        this.f25289a = i10;
        if (i10 == 1) {
            this.f25290b = new LinkedHashMap();
        } else if (i10 == 2) {
            this.f25290b = new HashMap();
        } else if (i10 == 4) {
            this.f25290b = new HashMap();
        } else if (i10 == 5) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            for (io.sentry.clientreport.d dVar : io.sentry.clientreport.d.values()) {
                for (EnumC3652i enumC3652i : EnumC3652i.values()) {
                    concurrentHashMap.put(new io.sentry.clientreport.b(dVar.getReason(), enumC3652i.getCategory()), new AtomicLong(0L));
                }
            }
            this.f25290b = Collections.unmodifiableMap(concurrentHashMap);
        } else if (i10 == 6) {
            this.f25290b = new LinkedHashMap();
        } else if (i10 != 8) {
            this.f25290b = new HashMap();
        } else {
            this.f25290b = new LinkedHashMap();
        }
    }

    @Override // T6.d
    public final boolean a(M6.a aVar) {
        for (Map.Entry entry : this.f25290b.entrySet()) {
            Object obj = aVar.f().get(entry.getKey());
            if (obj != null) {
                if (((Pattern) entry.getValue()).matcher(String.valueOf(obj)).matches()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void b(AbstractC6540b... abstractC6540bArr) {
        AbstractC3557B.c0("migrations", abstractC6540bArr);
        for (AbstractC6540b abstractC6540b : abstractC6540bArr) {
            int i10 = abstractC6540b.f50712a;
            Map map = this.f25290b;
            Integer valueOf = Integer.valueOf(i10);
            Object obj = map.get(valueOf);
            if (obj == null) {
                obj = new TreeMap();
                map.put(valueOf, obj);
            }
            TreeMap treeMap = (TreeMap) obj;
            int i11 = abstractC6540b.f50713b;
            if (treeMap.containsKey(Integer.valueOf(i11))) {
                AbstractC3612c.r("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i11)) + " with " + abstractC6540b);
            }
            treeMap.put(Integer.valueOf(i11), abstractC6540b);
        }
    }

    public final kotlinx.serialization.json.c c() {
        return new kotlinx.serialization.json.c(this.f25290b);
    }

    public final String d(String str) {
        return i(Nh.r.u(str)).h();
    }

    public final String e(String str, String str2) {
        String str3 = (String) this.f25290b.get(str + '.' + str2);
        if (str3 != null) {
            return str3;
        }
        return str2;
    }

    public final String f(String str) {
        if (!"()V".equals(str)) {
            StringBuilder sb2 = new StringBuilder(Separators.LPAREN);
            for (Nh.r rVar : Nh.r.d(str)) {
                sb2.append(i(rVar).h());
            }
            Nh.r v10 = Nh.r.v(Nh.r.q(str), str.length(), str);
            if (v10 == Nh.r.f13211e) {
                sb2.append(")V");
            } else {
                sb2.append(')');
                sb2.append(i(v10).h());
            }
            return sb2.toString();
        }
        return str;
    }

    public final String g(String str, String str2, String str3) {
        String str4 = (String) this.f25290b.get(str + '.' + str2 + str3);
        if (str4 != null) {
            return str4;
        }
        return str2;
    }

    public final String h(String str, boolean z10) {
        if (str == null) {
            return null;
        }
        C0813a c0813a = new C0813a(str, 10, 0);
        Ph.b bVar = new Ph.b();
        Oh.e eVar = new Oh.e(bVar, this);
        if (z10) {
            C0813a.d(c0813a.f9398Z, 0, eVar);
        } else {
            c0813a.b(eVar);
        }
        return bVar.f14258Y.toString();
    }

    public final Nh.r i(Nh.r rVar) {
        switch (rVar.s()) {
            case 9:
                StringBuilder sb2 = new StringBuilder();
                for (int i10 = 0; i10 < rVar.i(); i10++) {
                    sb2.append('[');
                }
                sb2.append(i(Nh.r.v(rVar.f13222c + rVar.i(), rVar.f13223d, rVar.f13221b)).h());
                return Nh.r.u(sb2.toString());
            case 10:
                String str = (String) this.f25290b.get(rVar.j());
                if (str != null) {
                    return Nh.r.o(str);
                }
                return rVar;
            case 11:
                return Nh.r.n(f(rVar.h()));
            default:
                return rVar;
        }
    }

    public final String j(String str) {
        if (str == null) {
            return null;
        }
        return i(Nh.r.o(str)).j();
    }

    public final String[] k(String[] strArr) {
        String[] strArr2 = null;
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String j6 = j(strArr[i10]);
            if (j6 != null) {
                if (strArr2 == null) {
                    strArr2 = (String[]) strArr.clone();
                }
                strArr2[i10] = j6;
            }
        }
        if (strArr2 != null) {
            return strArr2;
        }
        return strArr;
    }

    public final Object l(Object obj) {
        Object eVar;
        String g10;
        String f6;
        if (obj instanceof Nh.r) {
            return i((Nh.r) obj);
        }
        int i10 = 0;
        if (obj instanceof Nh.j) {
            Nh.j jVar = (Nh.j) obj;
            int i11 = jVar.f13090a;
            if (i11 <= 4) {
                i10 = 1;
            }
            String str = jVar.f13091b;
            String j6 = j(str);
            String str2 = jVar.f13092c;
            String str3 = jVar.f13093d;
            if (i10 != 0) {
                g10 = e(str, str2);
            } else {
                g10 = g(str, str2, str3);
            }
            String str4 = g10;
            if (i10 != 0) {
                f6 = d(str3);
            } else {
                f6 = f(str3);
            }
            eVar = new Nh.j(i11, j6, str4, f6, jVar.f13094e);
        } else if (obj instanceof Nh.e) {
            Nh.e eVar2 = (Nh.e) obj;
            int length = eVar2.f13050d.length;
            Object[] objArr = new Object[length];
            while (i10 < length) {
                objArr[i10] = l(eVar2.f13050d[i10]);
                i10++;
            }
            StringBuilder sb2 = new StringBuilder(Separators.DOT);
            String str5 = eVar2.f13047a;
            sb2.append(str5);
            String str6 = eVar2.f13048b;
            sb2.append(str6);
            String str7 = (String) this.f25290b.get(sb2.toString());
            if (str7 != null) {
                str5 = str7;
            }
            eVar = new Nh.e(str5, d(str6), (Nh.j) l(eVar2.f13049c), objArr);
        } else {
            return obj;
        }
        return eVar;
    }

    public final kotlinx.serialization.json.b m(String str, kotlinx.serialization.json.b bVar) {
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
        AbstractC3557B.c0("element", bVar);
        return (kotlinx.serialization.json.b) this.f25290b.put(str, bVar);
    }

    public final void n(String str, Object obj) {
        if (obj == null) {
            this.f25290b.put(str, null);
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls != Boolean.class && cls != Byte.class && cls != Integer.class && cls != Long.class && cls != Float.class && cls != Double.class && cls != String.class && cls != Boolean[].class && cls != Byte[].class && cls != Integer[].class && cls != Long[].class && cls != Float[].class && cls != Double[].class && cls != String[].class) {
            int i10 = 0;
            if (cls == boolean[].class) {
                Map map = this.f25290b;
                boolean[] zArr = (boolean[]) obj;
                String str2 = L3.g.f10713b;
                Boolean[] boolArr = new Boolean[zArr.length];
                while (i10 < zArr.length) {
                    boolArr[i10] = Boolean.valueOf(zArr[i10]);
                    i10++;
                }
                map.put(str, boolArr);
                return;
            } else if (cls == byte[].class) {
                Map map2 = this.f25290b;
                byte[] bArr = (byte[]) obj;
                String str3 = L3.g.f10713b;
                Byte[] bArr2 = new Byte[bArr.length];
                while (i10 < bArr.length) {
                    bArr2[i10] = Byte.valueOf(bArr[i10]);
                    i10++;
                }
                map2.put(str, bArr2);
                return;
            } else if (cls == int[].class) {
                Map map3 = this.f25290b;
                int[] iArr = (int[]) obj;
                String str4 = L3.g.f10713b;
                Integer[] numArr = new Integer[iArr.length];
                while (i10 < iArr.length) {
                    numArr[i10] = Integer.valueOf(iArr[i10]);
                    i10++;
                }
                map3.put(str, numArr);
                return;
            } else if (cls == long[].class) {
                Map map4 = this.f25290b;
                long[] jArr = (long[]) obj;
                String str5 = L3.g.f10713b;
                Long[] lArr = new Long[jArr.length];
                while (i10 < jArr.length) {
                    lArr[i10] = Long.valueOf(jArr[i10]);
                    i10++;
                }
                map4.put(str, lArr);
                return;
            } else if (cls == float[].class) {
                Map map5 = this.f25290b;
                float[] fArr = (float[]) obj;
                String str6 = L3.g.f10713b;
                Float[] fArr2 = new Float[fArr.length];
                while (i10 < fArr.length) {
                    fArr2[i10] = Float.valueOf(fArr[i10]);
                    i10++;
                }
                map5.put(str, fArr2);
                return;
            } else if (cls == double[].class) {
                Map map6 = this.f25290b;
                double[] dArr = (double[]) obj;
                String str7 = L3.g.f10713b;
                Double[] dArr2 = new Double[dArr.length];
                while (i10 < dArr.length) {
                    dArr2[i10] = Double.valueOf(dArr[i10]);
                    i10++;
                }
                map6.put(str, dArr2);
                return;
            } else {
                throw new IllegalArgumentException("Key " + str + " has invalid type " + cls);
            }
        }
        this.f25290b.put(str, obj);
    }

    public final void o(HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            n((String) entry.getKey(), entry.getValue());
        }
    }

    public final String toString() {
        switch (this.f25289a) {
            case 4:
                return "AllSampler { sample=true }";
            default:
                return super.toString();
        }
    }

    public D(String str, String str2) {
        this.f25289a = 7;
        this.f25290b = Collections.singletonMap(str, str2);
    }

    public D(q4.o oVar) {
        this.f25289a = 3;
        this.f25290b = AbstractC4268D.m1(oVar.f43885Y);
    }
}
