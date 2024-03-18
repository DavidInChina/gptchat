package x6;

import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import l8.AbstractC4344b;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class R1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f49072a;

    public /* synthetic */ R1(int i10) {
        this.f49072a = i10;
    }

    public static S1 a(String str) {
        S1[] values;
        for (S1 s12 : S1.values()) {
            if (AbstractC3557B.K(s12.f49089Y, str)) {
                return s12;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static T1 b(String str) {
        T1[] values;
        for (T1 t12 : T1.values()) {
            if (AbstractC3557B.K(t12.f49098Y, str)) {
                return t12;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static X1 c(String str) {
        X1[] values;
        for (X1 x12 : X1.values()) {
            if (AbstractC3557B.K(x12.f49150Y, str)) {
                return x12;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static B6.j d(I8.u uVar) {
        try {
            String T = uVar.q0(ParameterNames.ID).T();
            AbstractC3557B.b0(ParameterNames.ID, T);
            return new B6.j(T);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Application", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Application", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Application", e12);
        }
    }

    public static B6.k e(I8.u uVar) {
        try {
            String T = uVar.q0(ParameterNames.ID).T();
            AbstractC3557B.b0(ParameterNames.ID, T);
            return new B6.k(T);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Session", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Session", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Session", e12);
        }
    }

    public static B6.o g(I8.u uVar) {
        try {
            String T = uVar.q0(ParameterNames.ID).T();
            AbstractC3557B.b0(ParameterNames.ID, T);
            return new B6.o(T);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Action", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Action", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Action", e12);
        }
    }

    public static B6.r h(I8.u uVar) {
        try {
            String T = uVar.q0(ParameterNames.ID).T();
            AbstractC3557B.b0(ParameterNames.ID, T);
            return new B6.r(T);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Session", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Session", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Session", e12);
        }
    }

    public static B6.s i(I8.u uVar) {
        B6.q qVar;
        try {
            String T = uVar.q0("message").T();
            I8.r q02 = uVar.q0("error");
            if (q02 != null) {
                qVar = AbstractC4344b.n0(q02.y());
            } else {
                qVar = null;
            }
            AbstractC3557B.b0("message", T);
            return new B6.s(T, qVar);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Telemetry", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Telemetry", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Telemetry", e12);
        }
    }

    public static Y1 k(I8.u uVar) {
        String str;
        String str2;
        Long l10;
        Long l11;
        Long l12;
        String str3;
        Long l13;
        Long l14;
        String str4;
        Long l15;
        String str5;
        Number number;
        String str6;
        Long l16;
        Long l17;
        Long l18;
        Long l19;
        Long l20;
        C6351y1 c6351y1;
        Boolean bool;
        Boolean bool2;
        C6348x1 c6348x1;
        J1 j12;
        F1 f12;
        G1 g1;
        Long l21;
        ArrayList arrayList;
        Number number2;
        Number number3;
        Number number4;
        Number number5;
        Number number6;
        Number number7;
        E1 e12;
        E1 e13;
        E1 e14;
        String T;
        try {
            String T10 = uVar.q0(ParameterNames.ID).T();
            I8.r q02 = uVar.q0("referrer");
            if (q02 != null) {
                str = q02.T();
            } else {
                str = null;
            }
            String T11 = uVar.q0("url").T();
            I8.r q03 = uVar.q0("name");
            if (q03 != null) {
                str2 = q03.T();
            } else {
                str2 = null;
            }
            I8.r q04 = uVar.q0("loading_time");
            if (q04 != null) {
                l10 = Long.valueOf(q04.I());
            } else {
                l10 = null;
            }
            I8.r q05 = uVar.q0("loading_type");
            int i10 = 0;
            if (q05 != null && (T = q05.T()) != null) {
                int[] h10 = AbstractC6708l.h(8);
                int length = h10.length;
                while (i10 < length) {
                    int i11 = h10[i10];
                    if (AbstractC3557B.K(AbstractC6301h1.g(i11), T)) {
                        i10 = i11;
                    } else {
                        i10++;
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            long I10 = uVar.q0("time_spent").I();
            I8.r q06 = uVar.q0("first_contentful_paint");
            if (q06 != null) {
                l11 = Long.valueOf(q06.I());
            } else {
                l11 = null;
            }
            I8.r q07 = uVar.q0("largest_contentful_paint");
            if (q07 != null) {
                l12 = Long.valueOf(q07.I());
            } else {
                l12 = null;
            }
            I8.r q08 = uVar.q0("largest_contentful_paint_target_selector");
            if (q08 != null) {
                str3 = q08.T();
            } else {
                str3 = null;
            }
            I8.r q09 = uVar.q0("first_input_delay");
            if (q09 != null) {
                l13 = Long.valueOf(q09.I());
            } else {
                l13 = null;
            }
            I8.r q010 = uVar.q0("first_input_time");
            if (q010 != null) {
                l14 = Long.valueOf(q010.I());
            } else {
                l14 = null;
            }
            I8.r q011 = uVar.q0("first_input_target_selector");
            if (q011 != null) {
                str4 = q011.T();
            } else {
                str4 = null;
            }
            I8.r q012 = uVar.q0("interaction_to_next_paint");
            if (q012 != null) {
                l15 = Long.valueOf(q012.I());
            } else {
                l15 = null;
            }
            I8.r q013 = uVar.q0("interaction_to_next_paint_target_selector");
            if (q013 != null) {
                str5 = q013.T();
            } else {
                str5 = null;
            }
            I8.r q014 = uVar.q0("cumulative_layout_shift");
            if (q014 != null) {
                number = q014.M();
            } else {
                number = null;
            }
            I8.r q015 = uVar.q0("cumulative_layout_shift_target_selector");
            if (q015 != null) {
                str6 = q015.T();
            } else {
                str6 = null;
            }
            I8.r q016 = uVar.q0("dom_complete");
            if (q016 != null) {
                l16 = Long.valueOf(q016.I());
            } else {
                l16 = null;
            }
            I8.r q017 = uVar.q0("dom_content_loaded");
            if (q017 != null) {
                l17 = Long.valueOf(q017.I());
            } else {
                l17 = null;
            }
            I8.r q018 = uVar.q0("dom_interactive");
            if (q018 != null) {
                l18 = Long.valueOf(q018.I());
            } else {
                l18 = null;
            }
            I8.r q019 = uVar.q0("load_event");
            if (q019 != null) {
                l19 = Long.valueOf(q019.I());
            } else {
                l19 = null;
            }
            I8.r q020 = uVar.q0("first_byte");
            if (q020 != null) {
                l20 = Long.valueOf(q020.I());
            } else {
                l20 = null;
            }
            I8.r q021 = uVar.q0("custom_timings");
            if (q021 != null) {
                c6351y1 = AbstractC3557B.V0(q021.y());
            } else {
                c6351y1 = null;
            }
            I8.r q022 = uVar.q0("is_active");
            if (q022 != null) {
                bool = Boolean.valueOf(q022.f());
            } else {
                bool = null;
            }
            I8.r q023 = uVar.q0("is_slow_rendered");
            if (q023 != null) {
                bool2 = Boolean.valueOf(q023.f());
            } else {
                bool2 = null;
            }
            C6322o1 I11 = com.google.android.gms.internal.play_billing.N.I(uVar.q0("action").y());
            D1 Q = com.google.android.gms.internal.play_billing.N.Q(uVar.q0("error").y());
            I8.r q024 = uVar.q0("crash");
            if (q024 != null) {
                c6348x1 = com.google.android.gms.internal.play_billing.N.M(q024.y());
            } else {
                c6348x1 = null;
            }
            I8.r q025 = uVar.q0("long_task");
            if (q025 != null) {
                j12 = AbstractC3557B.Z0(q025.y());
            } else {
                j12 = null;
            }
            I8.r q026 = uVar.q0("frozen_frame");
            if (q026 != null) {
                f12 = com.google.android.gms.internal.play_billing.N.R(q026.y());
            } else {
                f12 = null;
            }
            P1 U10 = com.google.android.gms.internal.play_billing.N.U(uVar.q0("resource").y());
            I8.r q027 = uVar.q0("frustration");
            if (q027 != null) {
                g1 = AbstractC3557B.Y0(q027.y());
            } else {
                g1 = null;
            }
            I8.r q028 = uVar.q0("in_foreground_periods");
            if (q028 != null) {
                ArrayList arrayList2 = q028.s().f8131Y;
                l21 = l12;
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(com.google.android.gms.internal.play_billing.N.S(((I8.r) it.next()).y()));
                }
                arrayList = arrayList3;
            } else {
                l21 = l12;
                arrayList = null;
            }
            I8.r q029 = uVar.q0("memory_average");
            if (q029 != null) {
                number2 = q029.M();
            } else {
                number2 = null;
            }
            I8.r q030 = uVar.q0("memory_max");
            if (q030 != null) {
                number3 = q030.M();
            } else {
                number3 = null;
            }
            I8.r q031 = uVar.q0("cpu_ticks_count");
            if (q031 != null) {
                number4 = q031.M();
            } else {
                number4 = null;
            }
            I8.r q032 = uVar.q0("cpu_ticks_per_second");
            if (q032 != null) {
                number5 = q032.M();
            } else {
                number5 = null;
            }
            I8.r q033 = uVar.q0("refresh_rate_average");
            if (q033 != null) {
                number6 = q033.M();
            } else {
                number6 = null;
            }
            I8.r q034 = uVar.q0("refresh_rate_min");
            if (q034 != null) {
                number7 = q034.M();
            } else {
                number7 = null;
            }
            I8.r q035 = uVar.q0("flutter_build_time");
            if (q035 != null) {
                e12 = AbstractC3557B.X0(q035.y());
            } else {
                e12 = null;
            }
            I8.r q036 = uVar.q0("flutter_raster_time");
            if (q036 != null) {
                e13 = AbstractC3557B.X0(q036.y());
            } else {
                e13 = null;
            }
            I8.r q037 = uVar.q0("js_refresh_rate");
            if (q037 != null) {
                e14 = AbstractC3557B.X0(q037.y());
            } else {
                e14 = null;
            }
            AbstractC3557B.b0(ParameterNames.ID, T10);
            AbstractC3557B.b0("url", T11);
            return new Y1(T10, str, T11, str2, l10, i10, I10, l11, l21, str3, l13, l14, str4, l15, str5, number, str6, l16, l17, l18, l19, l20, c6351y1, bool, bool2, I11, Q, c6348x1, j12, f12, U10, g1, arrayList, number2, number3, number4, number5, number6, number7, e12, e13, e14);
        } catch (IllegalStateException e10) {
            throw new I8.v(e10);
        } catch (NullPointerException e11) {
            throw new I8.v(e11);
        } catch (NumberFormatException e15) {
            throw new I8.v(e15);
        }
    }

    public final B6.l f(I8.u uVar) {
        String[] strArr;
        try {
            String T = uVar.q0("message").T();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((K8.j) uVar.f8133Y.entrySet()).iterator();
            while (((K8.k) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((K8.i) it).next();
                switch (this.f49072a) {
                    case 2:
                        strArr = V1.f49116f;
                        break;
                    default:
                        strArr = B6.l.f1946f;
                        break;
                }
                if (!kf.q.S2(entry.getKey(), strArr)) {
                    Object key = entry.getKey();
                    AbstractC3557B.b0("entry.key", key);
                    linkedHashMap.put(key, entry.getValue());
                }
            }
            AbstractC3557B.b0("message", T);
            return new B6.l(T, linkedHashMap);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Telemetry", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Telemetry", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Telemetry", e12);
        }
    }

    public final V1 j(I8.u uVar) {
        String str;
        String str2;
        String[] strArr;
        try {
            I8.r q02 = uVar.q0(ParameterNames.ID);
            String str3 = null;
            if (q02 != null) {
                str = q02.T();
            } else {
                str = null;
            }
            I8.r q03 = uVar.q0("name");
            if (q03 != null) {
                str2 = q03.T();
            } else {
                str2 = null;
            }
            I8.r q04 = uVar.q0("email");
            if (q04 != null) {
                str3 = q04.T();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((K8.j) uVar.f8133Y.entrySet()).iterator();
            while (((K8.k) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((K8.i) it).next();
                switch (this.f49072a) {
                    case 2:
                        strArr = V1.f49116f;
                        break;
                    default:
                        strArr = B6.l.f1946f;
                        break;
                }
                if (!kf.q.S2(entry.getKey(), strArr)) {
                    Object key = entry.getKey();
                    AbstractC3557B.b0("entry.key", key);
                    linkedHashMap.put(key, entry.getValue());
                }
            }
            return new V1(str, str2, str3, linkedHashMap);
        } catch (IllegalStateException e10) {
            throw new RuntimeException("Unable to parse json into type Usr", e10);
        } catch (NullPointerException e11) {
            throw new RuntimeException("Unable to parse json into type Usr", e11);
        } catch (NumberFormatException e12) {
            throw new RuntimeException("Unable to parse json into type Usr", e12);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ R1(int i10, int i11) {
        this(0);
        this.f49072a = i10;
        switch (i10) {
            case 1:
                this(1);
                return;
            case 2:
                this(2);
                return;
            case 3:
                this(3);
                return;
            case 4:
                this(4);
                return;
            case 5:
                this(5);
                return;
            case 6:
                this(6);
                return;
            case 7:
                this(7);
                return;
            case 8:
                this(8);
                return;
            case 9:
                this(9);
                return;
            case 10:
                this(10);
                return;
            case 11:
                this(11);
                return;
            case 12:
                this(12);
                return;
            case 13:
                this(13);
                return;
            case 14:
                this(14);
                return;
            case 15:
                this(15);
                return;
            case 16:
                this(16);
                return;
            case 17:
                this(17);
                return;
            case 18:
                this(18);
                return;
            case 19:
                this(19);
                return;
            case 20:
                this(20);
                return;
            case 21:
                this(21);
                return;
            case 22:
                this(22);
                return;
            case 23:
                this(23);
                return;
            case 24:
                this(24);
                return;
            case 25:
                this(25);
                return;
            case 26:
                this(26);
                return;
            case 27:
                this(27);
                return;
            case 28:
                this(28);
                return;
            case 29:
                this(29);
                return;
            default:
                return;
        }
    }
}
