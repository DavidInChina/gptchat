package j$.util.stream;

import j$.util.Map;
import j$.util.Spliterator;
import java.util.EnumMap;
import java.util.Map;

/* JADX WARN: Init of enum DISTINCT can be incorrect */
/* JADX WARN: Init of enum ORDERED can be incorrect */
/* JADX WARN: Init of enum SHORT_CIRCUIT can be incorrect */
/* JADX WARN: Init of enum SIZED can be incorrect */
/* JADX WARN: Init of enum SORTED can be incorrect */
/* renamed from: j$.util.stream.e3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
enum EnumC3759e3 {
    DISTINCT(0, r7),
    SORTED(1, r10),
    ORDERED(2, r11),
    SIZED(3, r13),
    SHORT_CIRCUIT(12, r13);
    

    /* renamed from: f  reason: collision with root package name */
    static final int f35622f;

    /* renamed from: g  reason: collision with root package name */
    static final int f35623g;

    /* renamed from: h  reason: collision with root package name */
    static final int f35624h;

    /* renamed from: i  reason: collision with root package name */
    private static final int f35625i;

    /* renamed from: j  reason: collision with root package name */
    private static final int f35626j;

    /* renamed from: k  reason: collision with root package name */
    private static final int f35627k;

    /* renamed from: l  reason: collision with root package name */
    static final int f35628l;

    /* renamed from: m  reason: collision with root package name */
    static final int f35629m;

    /* renamed from: n  reason: collision with root package name */
    static final int f35630n;

    /* renamed from: o  reason: collision with root package name */
    static final int f35631o;

    /* renamed from: p  reason: collision with root package name */
    static final int f35632p;

    /* renamed from: q  reason: collision with root package name */
    static final int f35633q;

    /* renamed from: r  reason: collision with root package name */
    static final int f35634r;

    /* renamed from: s  reason: collision with root package name */
    static final int f35635s;

    /* renamed from: t  reason: collision with root package name */
    static final int f35636t;

    /* renamed from: u  reason: collision with root package name */
    static final int f35637u;

    /* renamed from: a  reason: collision with root package name */
    private final Map f35639a;

    /* renamed from: b  reason: collision with root package name */
    private final int f35640b;

    /* renamed from: c  reason: collision with root package name */
    private final int f35641c;

    /* renamed from: d  reason: collision with root package name */
    private final int f35642d;

    /* renamed from: e  reason: collision with root package name */
    private final int f35643e;

    static {
        EnumC3754d3 enumC3754d3 = EnumC3754d3.SPLITERATOR;
        C3749c3 z10 = z(enumC3754d3);
        EnumC3754d3 enumC3754d32 = EnumC3754d3.STREAM;
        z10.a(enumC3754d32);
        EnumC3754d3 enumC3754d33 = EnumC3754d3.OP;
        z10.f35607a.put(enumC3754d33, 3);
        C3749c3 z11 = z(enumC3754d3);
        z11.a(enumC3754d32);
        z11.f35607a.put(enumC3754d33, 3);
        C3749c3 z12 = z(enumC3754d3);
        z12.a(enumC3754d32);
        Map map = z12.f35607a;
        map.put(enumC3754d33, 3);
        EnumC3754d3 enumC3754d34 = EnumC3754d3.TERMINAL_OP;
        map.put(enumC3754d34, 2);
        EnumC3754d3 enumC3754d35 = EnumC3754d3.UPSTREAM_TERMINAL_OP;
        map.put(enumC3754d35, 2);
        C3749c3 z13 = z(enumC3754d3);
        z13.a(enumC3754d32);
        z13.f35607a.put(enumC3754d33, 2);
        z(enumC3754d33).a(enumC3754d34);
        f35622f = p(enumC3754d3);
        f35623g = p(enumC3754d32);
        f35624h = p(enumC3754d33);
        p(enumC3754d34);
        p(enumC3754d35);
        int i10 = 0;
        for (EnumC3759e3 enumC3759e3 : values()) {
            i10 |= enumC3759e3.f35643e;
        }
        f35625i = i10;
        int i11 = f35623g;
        f35626j = i11;
        int i12 = i11 << 1;
        f35627k = i12;
        f35628l = i11 | i12;
        EnumC3759e3 enumC3759e32 = DISTINCT;
        f35629m = enumC3759e32.f35641c;
        f35630n = enumC3759e32.f35642d;
        EnumC3759e3 enumC3759e33 = SORTED;
        f35631o = enumC3759e33.f35641c;
        f35632p = enumC3759e33.f35642d;
        EnumC3759e3 enumC3759e34 = ORDERED;
        f35633q = enumC3759e34.f35641c;
        f35634r = enumC3759e34.f35642d;
        EnumC3759e3 enumC3759e35 = SIZED;
        f35635s = enumC3759e35.f35641c;
        f35636t = enumC3759e35.f35642d;
        f35637u = SHORT_CIRCUIT.f35641c;
    }

    EnumC3759e3(int i10, C3749c3 c3749c3) {
        EnumC3754d3[] values = EnumC3754d3.values();
        int length = values.length;
        int i11 = 0;
        while (true) {
            Map map = c3749c3.f35607a;
            if (i11 >= length) {
                this.f35639a = map;
                int i12 = i10 * 2;
                this.f35640b = i12;
                this.f35641c = 1 << i12;
                this.f35642d = 2 << i12;
                this.f35643e = 3 << i12;
                return;
            }
            Map.EL.a(map, values[i11], 0);
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int A(int i10) {
        return i10 & ((~i10) >> 1) & f35626j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(int i10, int i11) {
        return i10 | (i11 & (i10 == 0 ? f35625i : ~(((f35626j & i10) << 1) | i10 | ((f35627k & i10) >> 1))));
    }

    private static int p(EnumC3754d3 enumC3754d3) {
        EnumC3759e3[] values;
        int i10 = 0;
        for (EnumC3759e3 enumC3759e3 : values()) {
            i10 |= ((Integer) enumC3759e3.f35639a.get(enumC3754d3)).intValue() << enumC3759e3.f35640b;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(Spliterator spliterator) {
        int characteristics = spliterator.characteristics();
        int i10 = characteristics & 4;
        int i11 = f35622f;
        return (i10 == 0 || spliterator.getComparator() == null) ? characteristics & i11 : characteristics & i11 & (-5);
    }

    private static C3749c3 z(EnumC3754d3 enumC3754d3) {
        C3749c3 c3749c3 = new C3749c3(new EnumMap(EnumC3754d3.class));
        c3749c3.a(enumC3754d3);
        return c3749c3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean s(int i10) {
        return (i10 & this.f35643e) == this.f35641c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean w(int i10) {
        int i11 = this.f35643e;
        return (i10 & i11) == i11;
    }
}
