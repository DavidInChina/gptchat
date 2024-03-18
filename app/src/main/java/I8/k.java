package I8;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class k extends E {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8102a;

    public k(int i10) {
        this.f8102a = i10;
    }

    public static r f(P8.b bVar, int i10) {
        int f6 = AbstractC6708l.f(i10);
        if (f6 != 5) {
            if (f6 != 6) {
                if (f6 != 7) {
                    if (f6 == 8) {
                        bVar.A0();
                        return t.f8132Y;
                    }
                    throw new IllegalStateException("Unexpected token: ".concat(E9.f.L(i10)));
                }
                return new w(Boolean.valueOf(bVar.a0()));
            }
            return new w(new K8.h(bVar.H0()));
        }
        return new w(bVar.H0());
    }

    public static void g(r rVar, P8.c cVar) {
        if (rVar != null && !(rVar instanceof t)) {
            boolean z10 = rVar instanceof w;
            if (z10) {
                if (z10) {
                    w wVar = (w) rVar;
                    Serializable serializable = wVar.f8134Y;
                    if (serializable instanceof Number) {
                        cVar.d0(wVar.M());
                        return;
                    } else if (serializable instanceof Boolean) {
                        cVar.m0(wVar.f());
                        return;
                    } else {
                        cVar.f0(wVar.T());
                        return;
                    }
                }
                throw new IllegalStateException("Not a JSON Primitive: " + rVar);
            } else if (rVar instanceof p) {
                cVar.h();
                Iterator it = rVar.s().f8131Y.iterator();
                while (it.hasNext()) {
                    g((r) it.next(), cVar);
                }
                cVar.k();
                return;
            } else if (rVar instanceof u) {
                cVar.i();
                Iterator it2 = ((K8.j) rVar.y().f8133Y.entrySet()).iterator();
                while (((K8.k) it2).hasNext()) {
                    Map.Entry entry = (Map.Entry) ((K8.i) it2).next();
                    cVar.p((String) entry.getKey());
                    g((r) entry.getValue(), cVar);
                }
                cVar.m();
                return;
            } else {
                throw new IllegalArgumentException("Couldn't write " + rVar.getClass());
            }
        }
        cVar.F();
    }

    @Override // I8.E
    public final Object b(P8.b bVar) {
        String str;
        String str2;
        r rVar;
        String str3;
        r rVar2;
        boolean z10;
        int i10 = 0;
        String str4 = null;
        switch (this.f8102a) {
            case 0:
                return e(bVar);
            case 1:
                ArrayList arrayList = new ArrayList();
                bVar.a();
                while (bVar.P()) {
                    try {
                        arrayList.add(Integer.valueOf(bVar.f0()));
                    } catch (NumberFormatException e10) {
                        throw new RuntimeException(e10);
                    }
                }
                bVar.k();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                while (i10 < size) {
                    atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
                    i10++;
                }
                return atomicIntegerArray;
            case 2:
                return e(bVar);
            case 3:
                return e(bVar);
            case 4:
                return e(bVar);
            case 5:
                if (bVar.R0() == 9) {
                    bVar.A0();
                    return null;
                }
                String H02 = bVar.H0();
                if (H02.length() == 1) {
                    return Character.valueOf(H02.charAt(0));
                }
                StringBuilder s10 = android.gov.nist.core.a.s("Expecting character, got: ", H02, "; at ");
                s10.append(bVar.O());
                throw new RuntimeException(s10.toString());
            case 6:
                int R02 = bVar.R0();
                if (R02 == 9) {
                    bVar.A0();
                    return null;
                } else if (R02 == 8) {
                    return Boolean.toString(bVar.a0());
                } else {
                    return bVar.H0();
                }
            case 7:
                if (bVar.R0() == 9) {
                    bVar.A0();
                    return null;
                }
                String H03 = bVar.H0();
                try {
                    return new BigDecimal(H03);
                } catch (NumberFormatException e11) {
                    StringBuilder s11 = android.gov.nist.core.a.s("Failed parsing '", H03, "' as BigDecimal; at path ");
                    s11.append(bVar.O());
                    throw new RuntimeException(s11.toString(), e11);
                }
            case 8:
                if (bVar.R0() == 9) {
                    bVar.A0();
                    return null;
                }
                String H04 = bVar.H0();
                try {
                    return new BigInteger(H04);
                } catch (NumberFormatException e12) {
                    StringBuilder s12 = android.gov.nist.core.a.s("Failed parsing '", H04, "' as BigInteger; at path ");
                    s12.append(bVar.O());
                    throw new RuntimeException(s12.toString(), e12);
                }
            case 9:
                if (bVar.R0() == 9) {
                    bVar.A0();
                    return null;
                }
                return new K8.h(bVar.H0());
            case 10:
                if (bVar.R0() == 9) {
                    bVar.A0();
                    return null;
                }
                return new StringBuilder(bVar.H0());
            case 11:
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            case 12:
                if (bVar.R0() == 9) {
                    bVar.A0();
                    return null;
                }
                return new StringBuffer(bVar.H0());
            case 13:
                if (bVar.R0() == 9) {
                    bVar.A0();
                    return null;
                }
                String H05 = bVar.H0();
                if ("null".equals(H05)) {
                    return null;
                }
                return new URL(H05);
            case 14:
                if (bVar.R0() == 9) {
                    bVar.A0();
                    return null;
                }
                try {
                    String H06 = bVar.H0();
                    if ("null".equals(H06)) {
                        return null;
                    }
                    return new URI(H06);
                } catch (URISyntaxException e13) {
                    throw new RuntimeException(e13);
                }
            case 15:
                if (bVar.R0() == 9) {
                    bVar.A0();
                    return null;
                }
                return InetAddress.getByName(bVar.H0());
            case 16:
                if (bVar.R0() == 9) {
                    bVar.A0();
                    return null;
                }
                String H07 = bVar.H0();
                try {
                    return UUID.fromString(H07);
                } catch (IllegalArgumentException e14) {
                    StringBuilder s13 = android.gov.nist.core.a.s("Failed parsing '", H07, "' as UUID; at path ");
                    s13.append(bVar.O());
                    throw new RuntimeException(s13.toString(), e14);
                }
            case 17:
                String H08 = bVar.H0();
                try {
                    return Currency.getInstance(H08);
                } catch (IllegalArgumentException e15) {
                    StringBuilder s14 = android.gov.nist.core.a.s("Failed parsing '", H08, "' as Currency; at path ");
                    s14.append(bVar.O());
                    throw new RuntimeException(s14.toString(), e15);
                }
            case 18:
                if (bVar.R0() == 9) {
                    bVar.A0();
                    return null;
                }
                bVar.h();
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                while (bVar.R0() != 4) {
                    String u02 = bVar.u0();
                    int f02 = bVar.f0();
                    if ("year".equals(u02)) {
                        i11 = f02;
                    } else if ("month".equals(u02)) {
                        i12 = f02;
                    } else if ("dayOfMonth".equals(u02)) {
                        i13 = f02;
                    } else if ("hourOfDay".equals(u02)) {
                        i14 = f02;
                    } else if ("minute".equals(u02)) {
                        i15 = f02;
                    } else if ("second".equals(u02)) {
                        i16 = f02;
                    }
                }
                bVar.m();
                return new GregorianCalendar(i11, i12, i13, i14, i15, i16);
            case 19:
                if (bVar.R0() == 9) {
                    bVar.A0();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(bVar.H0(), "_");
                if (stringTokenizer.hasMoreElements()) {
                    str = stringTokenizer.nextToken();
                } else {
                    str = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    str2 = stringTokenizer.nextToken();
                } else {
                    str2 = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    str4 = stringTokenizer.nextToken();
                }
                if (str2 == null && str4 == null) {
                    return new Locale(str);
                }
                if (str4 == null) {
                    return new Locale(str, str2);
                }
                return new Locale(str, str2, str4);
            case 20:
                if (bVar instanceof L8.g) {
                    L8.g gVar = (L8.g) bVar;
                    int R03 = gVar.R0();
                    if (R03 != 5 && R03 != 2 && R03 != 4 && R03 != 10) {
                        r rVar3 = (r) gVar.d1();
                        gVar.X0();
                        return rVar3;
                    }
                    throw new IllegalStateException("Unexpected " + E9.f.L(R03) + " when reading a JsonElement.");
                }
                int R04 = bVar.R0();
                int f6 = AbstractC6708l.f(R04);
                if (f6 != 0) {
                    if (f6 != 2) {
                        rVar = null;
                    } else {
                        bVar.h();
                        rVar = new u();
                    }
                } else {
                    bVar.a();
                    rVar = new p();
                }
                if (rVar == null) {
                    return f(bVar, R04);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (bVar.P()) {
                        if (rVar instanceof u) {
                            str3 = bVar.u0();
                        } else {
                            str3 = null;
                        }
                        int R05 = bVar.R0();
                        int f10 = AbstractC6708l.f(R05);
                        if (f10 != 0) {
                            if (f10 != 2) {
                                rVar2 = null;
                            } else {
                                bVar.h();
                                rVar2 = new u();
                            }
                        } else {
                            bVar.a();
                            rVar2 = new p();
                        }
                        if (rVar2 != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (rVar2 == null) {
                            rVar2 = f(bVar, R05);
                        }
                        if (rVar instanceof p) {
                            ((p) rVar).U(rVar2);
                        } else {
                            ((u) rVar).U(str3, rVar2);
                        }
                        if (z10) {
                            arrayDeque.addLast(rVar);
                            rVar = rVar2;
                        }
                    } else {
                        if (rVar instanceof p) {
                            bVar.k();
                        } else {
                            bVar.m();
                        }
                        if (arrayDeque.isEmpty()) {
                            return rVar;
                        }
                        rVar = (r) arrayDeque.removeLast();
                    }
                }
            case 21:
                BitSet bitSet = new BitSet();
                bVar.a();
                int R06 = bVar.R0();
                while (R06 != 2) {
                    int f11 = AbstractC6708l.f(R06);
                    if (f11 != 5 && f11 != 6) {
                        if (f11 == 7) {
                            if (!bVar.a0()) {
                                i10++;
                                R06 = bVar.R0();
                            }
                            bitSet.set(i10);
                            i10++;
                            R06 = bVar.R0();
                        } else {
                            throw new RuntimeException("Invalid bitset value type: " + E9.f.L(R06) + "; at path " + bVar.r());
                        }
                    } else {
                        int f03 = bVar.f0();
                        if (f03 != 0) {
                            if (f03 != 1) {
                                StringBuilder q10 = android.gov.nist.core.a.q("Invalid bitset value ", f03, ", expected 0 or 1; at path ");
                                q10.append(bVar.O());
                                throw new RuntimeException(q10.toString());
                            }
                            bitSet.set(i10);
                            i10++;
                            R06 = bVar.R0();
                        } else {
                            continue;
                            i10++;
                            R06 = bVar.R0();
                        }
                    }
                }
                bVar.k();
                return bitSet;
            case 22:
                return d(bVar);
            case 23:
                return d(bVar);
            case 24:
                return e(bVar);
            case 25:
                return e(bVar);
            case 26:
                return e(bVar);
            case 27:
                try {
                    return new AtomicInteger(bVar.f0());
                } catch (NumberFormatException e16) {
                    throw new RuntimeException(e16);
                }
            default:
                return new AtomicBoolean(bVar.a0());
        }
    }

    @Override // I8.E
    public final void c(P8.c cVar, Object obj) {
        String str = "null";
        int i10 = this.f8102a;
        int i11 = 0;
        String str2 = null;
        switch (i10) {
            case 0:
                h(cVar, (Number) obj);
                return;
            case 1:
                AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
                cVar.h();
                int length = atomicIntegerArray.length();
                while (i11 < length) {
                    cVar.V(atomicIntegerArray.get(i11));
                    i11++;
                }
                cVar.k();
                return;
            case 2:
                h(cVar, (Number) obj);
                return;
            case 3:
                h(cVar, (Number) obj);
                return;
            case 4:
                h(cVar, (Number) obj);
                return;
            case 5:
                Character ch2 = (Character) obj;
                if (ch2 != null) {
                    str2 = String.valueOf(ch2);
                }
                cVar.f0(str2);
                return;
            case 6:
                cVar.f0((String) obj);
                return;
            case 7:
                cVar.d0((BigDecimal) obj);
                return;
            case 8:
                cVar.d0((BigInteger) obj);
                return;
            case 9:
                cVar.d0((K8.h) obj);
                return;
            case 10:
                StringBuilder sb2 = (StringBuilder) obj;
                if (sb2 != null) {
                    str2 = sb2.toString();
                }
                cVar.f0(str2);
                return;
            case 11:
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
            case 12:
                StringBuffer stringBuffer = (StringBuffer) obj;
                if (stringBuffer != null) {
                    str2 = stringBuffer.toString();
                }
                cVar.f0(str2);
                return;
            case 13:
                URL url = (URL) obj;
                if (url != null) {
                    str2 = url.toExternalForm();
                }
                cVar.f0(str2);
                return;
            case 14:
                URI uri = (URI) obj;
                if (uri != null) {
                    str2 = uri.toASCIIString();
                }
                cVar.f0(str2);
                return;
            case 15:
                InetAddress inetAddress = (InetAddress) obj;
                if (inetAddress != null) {
                    str2 = inetAddress.getHostAddress();
                }
                cVar.f0(str2);
                return;
            case 16:
                UUID uuid = (UUID) obj;
                if (uuid != null) {
                    str2 = uuid.toString();
                }
                cVar.f0(str2);
                return;
            case 17:
                cVar.f0(((Currency) obj).getCurrencyCode());
                return;
            case 18:
                Calendar calendar = (Calendar) obj;
                if (calendar == null) {
                    cVar.F();
                    return;
                }
                cVar.i();
                cVar.p("year");
                cVar.V(calendar.get(1));
                cVar.p("month");
                cVar.V(calendar.get(2));
                cVar.p("dayOfMonth");
                cVar.V(calendar.get(5));
                cVar.p("hourOfDay");
                cVar.V(calendar.get(11));
                cVar.p("minute");
                cVar.V(calendar.get(12));
                cVar.p("second");
                cVar.V(calendar.get(13));
                cVar.m();
                return;
            case 19:
                Locale locale = (Locale) obj;
                if (locale != null) {
                    str2 = locale.toString();
                }
                cVar.f0(str2);
                return;
            case 20:
                g((r) obj, cVar);
                return;
            case 21:
                BitSet bitSet = (BitSet) obj;
                cVar.h();
                int length2 = bitSet.length();
                while (i11 < length2) {
                    cVar.V(bitSet.get(i11) ? 1L : 0L);
                    i11++;
                }
                cVar.k();
                return;
            case 22:
                Boolean bool = (Boolean) obj;
                switch (i10) {
                    case 22:
                        cVar.a0(bool);
                        return;
                    default:
                        if (bool != null) {
                            str = bool.toString();
                        }
                        cVar.f0(str);
                        return;
                }
            case 23:
                Boolean bool2 = (Boolean) obj;
                switch (i10) {
                    case 22:
                        cVar.a0(bool2);
                        return;
                    default:
                        if (bool2 != null) {
                            str = bool2.toString();
                        }
                        cVar.f0(str);
                        return;
                }
            case 24:
                h(cVar, (Number) obj);
                return;
            case 25:
                h(cVar, (Number) obj);
                return;
            case 26:
                h(cVar, (Number) obj);
                return;
            case 27:
                cVar.V(((AtomicInteger) obj).get());
                return;
            default:
                cVar.m0(((AtomicBoolean) obj).get());
                return;
        }
    }

    public final Boolean d(P8.b bVar) {
        switch (this.f8102a) {
            case 22:
                int R02 = bVar.R0();
                if (R02 == 9) {
                    bVar.A0();
                    return null;
                } else if (R02 == 6) {
                    return Boolean.valueOf(Boolean.parseBoolean(bVar.H0()));
                } else {
                    return Boolean.valueOf(bVar.a0());
                }
            default:
                if (bVar.R0() == 9) {
                    bVar.A0();
                    return null;
                }
                return Boolean.valueOf(bVar.H0());
        }
    }

    public final Number e(P8.b bVar) {
        switch (this.f8102a) {
            case 0:
                if (bVar.R0() == 9) {
                    bVar.A0();
                    return null;
                }
                return Long.valueOf(bVar.m0());
            case 2:
                if (bVar.R0() == 9) {
                    bVar.A0();
                    return null;
                }
                try {
                    return Long.valueOf(bVar.m0());
                } catch (NumberFormatException e10) {
                    throw new RuntimeException(e10);
                }
            case 3:
                if (bVar.R0() == 9) {
                    bVar.A0();
                    return null;
                }
                return Float.valueOf((float) bVar.d0());
            case 4:
                if (bVar.R0() == 9) {
                    bVar.A0();
                    return null;
                }
                return Double.valueOf(bVar.d0());
            case 24:
                if (bVar.R0() == 9) {
                    bVar.A0();
                    return null;
                }
                try {
                    int f02 = bVar.f0();
                    if (f02 <= 255 && f02 >= -128) {
                        return Byte.valueOf((byte) f02);
                    }
                    StringBuilder q10 = android.gov.nist.core.a.q("Lossy conversion from ", f02, " to byte; at path ");
                    q10.append(bVar.O());
                    throw new RuntimeException(q10.toString());
                } catch (NumberFormatException e11) {
                    throw new RuntimeException(e11);
                }
            case 25:
                if (bVar.R0() == 9) {
                    bVar.A0();
                    return null;
                }
                try {
                    int f03 = bVar.f0();
                    if (f03 <= 65535 && f03 >= -32768) {
                        return Short.valueOf((short) f03);
                    }
                    StringBuilder q11 = android.gov.nist.core.a.q("Lossy conversion from ", f03, " to short; at path ");
                    q11.append(bVar.O());
                    throw new RuntimeException(q11.toString());
                } catch (NumberFormatException e12) {
                    throw new RuntimeException(e12);
                }
            default:
                if (bVar.R0() == 9) {
                    bVar.A0();
                    return null;
                }
                try {
                    return Integer.valueOf(bVar.f0());
                } catch (NumberFormatException e13) {
                    throw new RuntimeException(e13);
                }
        }
    }

    public final void h(P8.c cVar, Number number) {
        switch (this.f8102a) {
            case 0:
                if (number == null) {
                    cVar.F();
                    return;
                } else {
                    cVar.f0(number.toString());
                    return;
                }
            case 2:
                if (number == null) {
                    cVar.F();
                    return;
                } else {
                    cVar.V(number.longValue());
                    return;
                }
            case 3:
                if (number == null) {
                    cVar.F();
                    return;
                }
                if (!(number instanceof Float)) {
                    number = Float.valueOf(number.floatValue());
                }
                cVar.d0(number);
                return;
            case 4:
                if (number == null) {
                    cVar.F();
                    return;
                } else {
                    cVar.S(number.doubleValue());
                    return;
                }
            case 24:
                if (number == null) {
                    cVar.F();
                    return;
                } else {
                    cVar.V(number.byteValue());
                    return;
                }
            case 25:
                if (number == null) {
                    cVar.F();
                    return;
                } else {
                    cVar.V(number.shortValue());
                    return;
                }
            default:
                if (number == null) {
                    cVar.F();
                    return;
                } else {
                    cVar.V(number.intValue());
                    return;
                }
        }
    }
}
