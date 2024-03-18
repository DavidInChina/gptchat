package L0;

import java.util.ArrayList;
import java.util.List;
import jf.AbstractC3953c;
import jf.y;

/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final q f10426Z = new q(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final q f10427h0 = new q(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final q f10428i0 = new q(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final q f10429j0 = new q(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final q f10430k0 = new q(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final q f10431l0 = new q(5);

    /* renamed from: m0  reason: collision with root package name */
    public static final q f10432m0 = new q(6);

    /* renamed from: n0  reason: collision with root package name */
    public static final q f10433n0 = new q(7);

    /* renamed from: o0  reason: collision with root package name */
    public static final q f10434o0 = new q(8);

    /* renamed from: p0  reason: collision with root package name */
    public static final q f10435p0 = new q(9);

    /* renamed from: q0  reason: collision with root package name */
    public static final q f10436q0 = new q(10);

    /* renamed from: r0  reason: collision with root package name */
    public static final q f10437r0 = new q(11);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f10438Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i10) {
        super(2);
        this.f10438Y = i10;
    }

    public final void a(y yVar) {
        switch (this.f10438Y) {
            case 1:
                return;
            case 2:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            default:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ArrayList M22;
        ArrayList M23;
        String str;
        AbstractC3953c abstractC3953c;
        int i10 = this.f10438Y;
        switch (i10) {
            case 0:
                List list = (List) obj;
                List list2 = (List) obj2;
                switch (i10) {
                    case 0:
                        if (list != null) {
                            M22 = kf.t.M2(list);
                            M22.addAll(list2);
                            break;
                        } else {
                            return list2;
                        }
                    default:
                        if (list != null) {
                            M22 = kf.t.M2(list);
                            M22.addAll(list2);
                            break;
                        } else {
                            return list2;
                        }
                }
                return M22;
            case 1:
                y yVar = (y) obj;
                y yVar2 = (y) obj2;
                a(yVar);
                return yVar;
            case 2:
                y yVar3 = (y) obj;
                y yVar4 = (y) obj2;
                a(yVar3);
                return yVar3;
            case 3:
                y yVar5 = (y) obj;
                y yVar6 = (y) obj2;
                a(yVar5);
                return yVar5;
            case 4:
                String str2 = (String) obj;
                String str3 = (String) obj2;
                switch (i10) {
                    case 4:
                        throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
                    default:
                        return str2;
                }
            case 5:
                g gVar = (g) obj;
                int i11 = ((g) obj2).f10380a;
                return gVar;
            case 6:
                String str4 = (String) obj;
                String str5 = (String) obj2;
                switch (i10) {
                    case 4:
                        throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
                    default:
                        return str4;
                }
            case 7:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                switch (i10) {
                    case 0:
                        if (list3 != null) {
                            M23 = kf.t.M2(list3);
                            M23.addAll(list4);
                            break;
                        } else {
                            return list4;
                        }
                    default:
                        if (list3 != null) {
                            M23 = kf.t.M2(list3);
                            M23.addAll(list4);
                            break;
                        } else {
                            return list4;
                        }
                }
                return M23;
            case 8:
                Float f6 = (Float) obj;
                ((Number) obj2).floatValue();
                return f6;
            case 9:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).getClass();
                return bool;
            case 10:
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar == null || (str = aVar.f10368a) == null) {
                    str = aVar2.f10368a;
                }
                if (aVar == null || (abstractC3953c = aVar.f10369b) == null) {
                    abstractC3953c = aVar2.f10369b;
                }
                return new a(str, abstractC3953c);
            default:
                if (obj == null) {
                    return obj2;
                }
                return obj;
        }
    }
}
