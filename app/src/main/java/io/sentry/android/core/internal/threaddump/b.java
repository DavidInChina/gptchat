package io.sentry.android.core.internal.threaddump;

import T0.m;
import android.gov.nist.core.Separators;
import io.sentry.C3645f1;
import io.sentry.EnumC3642e1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.protocol.w;
import io.sentry.protocol.x;
import io.sentry.protocol.y;
import io.sentry.r1;
import io.sentry.s1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f34137d = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern f34138e = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");

    /* renamed from: f  reason: collision with root package name */
    public static final Pattern f34139f = Pattern.compile(" *(?:native: )?#\\d+ \\S+ [0-9a-fA-F]+\\s+(.*?)\\s+\\((.*)\\+(\\d+)\\)(?: \\(.*\\))?");

    /* renamed from: g  reason: collision with root package name */
    public static final Pattern f34140g = Pattern.compile(" *(?:native: )?#\\d+ \\S+ [0-9a-fA-F]+\\s+(.*)\\s*\\(?(.*)\\)?(?: \\(.*\\))?");

    /* renamed from: h  reason: collision with root package name */
    public static final Pattern f34141h = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");

    /* renamed from: i  reason: collision with root package name */
    public static final Pattern f34142i = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f34143j = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f34144k = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f34145l = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f34146m = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: n  reason: collision with root package name */
    public static final Pattern f34147n = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");

    /* renamed from: o  reason: collision with root package name */
    public static final Pattern f34148o = Pattern.compile(" *- waiting to lock an unknown object");

    /* renamed from: p  reason: collision with root package name */
    public static final Pattern f34149p = Pattern.compile("\\s+");

    /* renamed from: a  reason: collision with root package name */
    public final r1 f34150a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f34151b;

    /* renamed from: c  reason: collision with root package name */
    public final s1 f34152c;

    public b(SentryAndroidOptions sentryAndroidOptions, boolean z10) {
        this.f34150a = sentryAndroidOptions;
        this.f34151b = z10;
        this.f34152c = new s1(sentryAndroidOptions);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [io.sentry.f1, java.lang.Object] */
    public static void a(y yVar, C3645f1 c3645f1) {
        Map map = yVar.f34672o0;
        if (map == null) {
            map = new HashMap();
        }
        C3645f1 c3645f12 = (C3645f1) map.get(c3645f1.f34336Z);
        if (c3645f12 != null) {
            c3645f12.f34335Y = Math.max(c3645f12.f34335Y, c3645f1.f34335Y);
        } else {
            String str = c3645f1.f34336Z;
            ?? obj = new Object();
            obj.f34335Y = c3645f1.f34335Y;
            obj.f34336Z = str;
            obj.f34337h0 = c3645f1.f34337h0;
            obj.f34338i0 = c3645f1.f34338i0;
            obj.f34339j0 = c3645f1.f34339j0;
            obj.f34340k0 = P4.a.p0(c3645f1.f34340k0);
            map.put(str, obj);
        }
        yVar.f34672o0 = map;
    }

    public static Long b(Matcher matcher, int i10) {
        String group = matcher.group(i10);
        if (group != null && group.length() != 0) {
            return Long.valueOf(Long.parseLong(group));
        }
        return null;
    }

    public static boolean c(Matcher matcher, String str) {
        matcher.reset(str);
        return matcher.matches();
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03a7 A[EDGE_INSN: B:133:0x03a7->B:118:0x03a7 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0181  */
    /* JADX WARN: Type inference failed for: r0v20, types: [io.sentry.f1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [io.sentry.f1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [io.sentry.f1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [io.sentry.f1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [io.sentry.f1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [io.sentry.f1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Object, io.sentry.protocol.w] */
    /* JADX WARN: Type inference failed for: r2v42, types: [java.lang.Object, io.sentry.protocol.w] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, io.sentry.protocol.w] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, io.sentry.protocol.w] */
    /* JADX WARN: Type inference failed for: r8v5, types: [io.sentry.protocol.y, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList d(m mVar) {
        String str;
        Matcher matcher;
        Pattern pattern;
        Matcher matcher2;
        Pattern pattern2;
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        boolean z11;
        String str2;
        Matcher matcher3;
        Matcher matcher4;
        Matcher matcher5;
        Matcher matcher6;
        w wVar;
        Matcher matcher7;
        Matcher matcher8;
        Matcher matcher9;
        Matcher matcher10;
        w wVar2;
        w wVar3;
        Integer num;
        Integer num2;
        boolean z12;
        b bVar = this;
        m mVar2 = mVar;
        ArrayList arrayList3 = new ArrayList();
        Pattern pattern3 = f34137d;
        String str3 = "";
        Matcher matcher11 = pattern3.matcher(str3);
        Pattern pattern4 = f34138e;
        Matcher matcher12 = pattern4.matcher(str3);
        while (mVar2.f16799d < mVar2.f16798c) {
            a T = mVar.T();
            r1 r1Var = bVar.f34150a;
            if (T == null) {
                r1Var.getLogger().f(EnumC3642e1.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                return arrayList3;
            }
            String str4 = T.f34136a;
            if (!c(matcher11, str4) && !c(matcher12, str4)) {
                arrayList = arrayList3;
                pattern2 = pattern3;
                str = str3;
                matcher2 = matcher11;
                pattern = pattern4;
                matcher = matcher12;
            } else {
                mVar2.f16799d--;
                ?? obj = new Object();
                Matcher matcher13 = pattern3.matcher(str3);
                Matcher matcher14 = pattern4.matcher(str3);
                if (mVar2.f16799d < mVar2.f16798c) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    a T10 = mVar.T();
                    if (T10 == null) {
                        r1Var.getLogger().f(EnumC3642e1.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                    } else {
                        String str5 = T10.f34136a;
                        if (c(matcher13, str5)) {
                            Long b10 = b(matcher13, 4);
                            if (b10 == null) {
                                r1Var.getLogger().f(EnumC3642e1.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                            } else {
                                obj.f34663Y = b10;
                                obj.f34665h0 = matcher13.group(1);
                                String group = matcher13.group(5);
                                if (group != null) {
                                    if (group.contains(Separators.SP)) {
                                        obj.f34666i0 = group.substring(0, group.indexOf(32));
                                    } else {
                                        obj.f34666i0 = group;
                                    }
                                }
                                str2 = obj.f34665h0;
                                if (str2 != null) {
                                    boolean equals = str2.equals("main");
                                    obj.f34670m0 = Boolean.valueOf(equals);
                                    obj.f34667j0 = Boolean.valueOf(equals);
                                    if (equals && !bVar.f34151b) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    obj.f34668k0 = Boolean.valueOf(z12);
                                }
                                ArrayList arrayList4 = new ArrayList();
                                Matcher matcher15 = f34139f.matcher(str3);
                                Matcher matcher16 = f34140g.matcher(str3);
                                Matcher matcher17 = f34141h.matcher(str3);
                                Matcher matcher18 = f34142i.matcher(str3);
                                pattern2 = pattern3;
                                Matcher matcher19 = f34143j.matcher(str3);
                                matcher2 = matcher11;
                                Matcher matcher20 = f34145l.matcher(str3);
                                pattern = pattern4;
                                Matcher matcher21 = f34144k.matcher(str3);
                                matcher = matcher12;
                                matcher3 = f34147n.matcher(str3);
                                arrayList2 = arrayList3;
                                matcher4 = f34146m.matcher(str3);
                                matcher5 = f34148o.matcher(str3);
                                matcher6 = f34149p.matcher(str3);
                                str = str3;
                                wVar = null;
                                while (true) {
                                    matcher7 = matcher3;
                                    if (mVar2.f16799d >= mVar2.f16798c) {
                                        break;
                                    }
                                    a T11 = mVar.T();
                                    if (T11 == null) {
                                        r1Var.getLogger().f(EnumC3642e1.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                                        break;
                                    }
                                    String str6 = T11.f34136a;
                                    if (c(matcher15, str6)) {
                                        ?? obj2 = new Object();
                                        obj2.f34649n0 = matcher15.group(1);
                                        obj2.f34642Z = matcher15.group(2);
                                        String group2 = matcher15.group(3);
                                        if (group2 != null && group2.length() != 0) {
                                            num2 = Integer.valueOf(Integer.parseInt(group2));
                                        } else {
                                            num2 = null;
                                        }
                                        obj2.f34644i0 = num2;
                                        arrayList4.add(obj2);
                                    } else if (c(matcher16, str6)) {
                                        ?? obj3 = new Object();
                                        obj3.f34649n0 = matcher16.group(1);
                                        obj3.f34642Z = matcher16.group(2);
                                        arrayList4.add(obj3);
                                    } else {
                                        boolean c10 = c(matcher17, str6);
                                        s1 s1Var = bVar.f34152c;
                                        if (c10) {
                                            ?? obj4 = new Object();
                                            String j6 = android.gov.nist.core.a.j(matcher17.group(1), Separators.DOT, matcher17.group(2));
                                            obj4.f34643h0 = j6;
                                            obj4.f34642Z = matcher17.group(3);
                                            obj4.f34641Y = matcher17.group(4);
                                            String group3 = matcher17.group(5);
                                            if (group3 != null && group3.length() != 0) {
                                                int parseInt = Integer.parseInt(group3);
                                                Integer valueOf = Integer.valueOf(parseInt);
                                                if (parseInt < 0) {
                                                    valueOf = null;
                                                }
                                                num = valueOf;
                                            } else {
                                                num = null;
                                            }
                                            obj4.f34644i0 = num;
                                            obj4.f34648m0 = s1Var.c(j6);
                                            arrayList4.add(obj4);
                                            wVar3 = obj4;
                                        } else if (c(matcher18, str6)) {
                                            ?? obj5 = new Object();
                                            String j10 = android.gov.nist.core.a.j(matcher18.group(1), Separators.DOT, matcher18.group(2));
                                            obj5.f34643h0 = j10;
                                            obj5.f34642Z = matcher18.group(3);
                                            obj5.f34648m0 = s1Var.c(j10);
                                            arrayList4.add(obj5);
                                            wVar3 = obj5;
                                        } else {
                                            wVar3 = wVar;
                                            if (c(matcher19, str6)) {
                                                if (wVar != null) {
                                                    ?? obj6 = new Object();
                                                    obj6.f34335Y = 1;
                                                    obj6.f34336Z = matcher19.group(1);
                                                    obj6.f34337h0 = matcher19.group(2);
                                                    obj6.f34338i0 = matcher19.group(3);
                                                    wVar.f34658w0 = obj6;
                                                    a(obj, obj6);
                                                    wVar3 = wVar;
                                                }
                                            } else {
                                                wVar3 = wVar;
                                                if (c(matcher20, str6)) {
                                                    if (wVar != null) {
                                                        ?? obj7 = new Object();
                                                        obj7.f34335Y = 2;
                                                        obj7.f34336Z = matcher20.group(1);
                                                        obj7.f34337h0 = matcher20.group(2);
                                                        obj7.f34338i0 = matcher20.group(3);
                                                        wVar.f34658w0 = obj7;
                                                        a(obj, obj7);
                                                        wVar3 = wVar;
                                                    }
                                                } else {
                                                    wVar3 = wVar;
                                                    if (c(matcher21, str6)) {
                                                        if (wVar != null) {
                                                            ?? obj8 = new Object();
                                                            obj8.f34335Y = 4;
                                                            obj8.f34336Z = matcher21.group(1);
                                                            obj8.f34337h0 = matcher21.group(2);
                                                            obj8.f34338i0 = matcher21.group(3);
                                                            wVar.f34658w0 = obj8;
                                                            a(obj, obj8);
                                                            wVar3 = wVar;
                                                        }
                                                    } else if (c(matcher7, str6)) {
                                                        if (wVar != null) {
                                                            ?? obj9 = new Object();
                                                            obj9.f34335Y = 8;
                                                            obj9.f34336Z = matcher7.group(1);
                                                            obj9.f34337h0 = matcher7.group(2);
                                                            obj9.f34338i0 = matcher7.group(3);
                                                            obj9.f34339j0 = b(matcher7, 4);
                                                            wVar.f34658w0 = obj9;
                                                            a(obj, obj9);
                                                        }
                                                        matcher7 = matcher7;
                                                        wVar3 = wVar;
                                                    } else {
                                                        matcher9 = matcher4;
                                                        if (c(matcher9, str6)) {
                                                            if (wVar != null) {
                                                                ?? obj10 = new Object();
                                                                obj10.f34335Y = 8;
                                                                matcher7 = matcher7;
                                                                obj10.f34336Z = matcher9.group(1);
                                                                obj10.f34337h0 = matcher9.group(2);
                                                                obj10.f34338i0 = matcher9.group(3);
                                                                wVar.f34658w0 = obj10;
                                                                a(obj, obj10);
                                                                wVar2 = wVar;
                                                            } else {
                                                                matcher7 = matcher7;
                                                                wVar2 = wVar;
                                                            }
                                                            matcher10 = matcher5;
                                                            matcher8 = matcher6;
                                                            wVar = wVar2;
                                                            matcher5 = matcher10;
                                                            matcher4 = matcher9;
                                                            matcher6 = matcher8;
                                                            matcher3 = matcher7;
                                                            bVar = this;
                                                            mVar2 = mVar;
                                                            wVar = wVar;
                                                        } else {
                                                            matcher7 = matcher7;
                                                            matcher10 = matcher5;
                                                            if (c(matcher10, str6)) {
                                                                if (wVar != null) {
                                                                    ?? obj11 = new Object();
                                                                    obj11.f34335Y = 8;
                                                                    wVar.f34658w0 = obj11;
                                                                    a(obj, obj11);
                                                                }
                                                                matcher8 = matcher6;
                                                            } else if (str6.length() == 0) {
                                                                break;
                                                            } else {
                                                                matcher8 = matcher6;
                                                                if (c(matcher8, str6)) {
                                                                    break;
                                                                }
                                                            }
                                                            matcher5 = matcher10;
                                                            matcher4 = matcher9;
                                                            matcher6 = matcher8;
                                                            matcher3 = matcher7;
                                                            bVar = this;
                                                            mVar2 = mVar;
                                                            wVar = wVar;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        matcher9 = matcher4;
                                        wVar2 = wVar3;
                                        matcher10 = matcher5;
                                        matcher8 = matcher6;
                                        wVar = wVar2;
                                        matcher5 = matcher10;
                                        matcher4 = matcher9;
                                        matcher6 = matcher8;
                                        matcher3 = matcher7;
                                        bVar = this;
                                        mVar2 = mVar;
                                        wVar = wVar;
                                    }
                                    matcher9 = matcher4;
                                    matcher10 = matcher5;
                                    matcher8 = matcher6;
                                    wVar = null;
                                    matcher5 = matcher10;
                                    matcher4 = matcher9;
                                    matcher6 = matcher8;
                                    matcher3 = matcher7;
                                    bVar = this;
                                    mVar2 = mVar;
                                    wVar = wVar;
                                }
                                Collections.reverse(arrayList4);
                                x xVar = new x(arrayList4);
                                xVar.f34661h0 = Boolean.TRUE;
                                obj.f34671n0 = xVar;
                                z11 = obj;
                            }
                        } else {
                            if (c(matcher14, str5)) {
                                Long b11 = b(matcher14, 3);
                                if (b11 == null) {
                                    r1Var.getLogger().f(EnumC3642e1.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                                } else {
                                    obj.f34663Y = b11;
                                    obj.f34665h0 = matcher14.group(1);
                                }
                            }
                            str2 = obj.f34665h0;
                            if (str2 != null) {
                            }
                            ArrayList arrayList42 = new ArrayList();
                            Matcher matcher152 = f34139f.matcher(str3);
                            Matcher matcher162 = f34140g.matcher(str3);
                            Matcher matcher172 = f34141h.matcher(str3);
                            Matcher matcher182 = f34142i.matcher(str3);
                            pattern2 = pattern3;
                            Matcher matcher192 = f34143j.matcher(str3);
                            matcher2 = matcher11;
                            Matcher matcher202 = f34145l.matcher(str3);
                            pattern = pattern4;
                            Matcher matcher212 = f34144k.matcher(str3);
                            matcher = matcher12;
                            matcher3 = f34147n.matcher(str3);
                            arrayList2 = arrayList3;
                            matcher4 = f34146m.matcher(str3);
                            matcher5 = f34148o.matcher(str3);
                            matcher6 = f34149p.matcher(str3);
                            str = str3;
                            wVar = null;
                            while (true) {
                                matcher7 = matcher3;
                                if (mVar2.f16799d >= mVar2.f16798c) {
                                }
                                matcher5 = matcher10;
                                matcher4 = matcher9;
                                matcher6 = matcher8;
                                matcher3 = matcher7;
                                bVar = this;
                                mVar2 = mVar;
                                wVar = wVar;
                            }
                            Collections.reverse(arrayList42);
                            x xVar2 = new x(arrayList42);
                            xVar2.f34661h0 = Boolean.TRUE;
                            obj.f34671n0 = xVar2;
                            z11 = obj;
                        }
                        arrayList = arrayList2;
                        if (!z11) {
                            arrayList.add(z11);
                        }
                    }
                }
                arrayList2 = arrayList3;
                pattern2 = pattern3;
                str = str3;
                matcher2 = matcher11;
                pattern = pattern4;
                matcher = matcher12;
                z11 = false;
                arrayList = arrayList2;
                if (!z11) {
                }
            }
            mVar2 = mVar;
            arrayList3 = arrayList;
            pattern3 = pattern2;
            matcher11 = matcher2;
            pattern4 = pattern;
            matcher12 = matcher;
            str3 = str;
            bVar = this;
        }
        return arrayList3;
    }
}
