package r0;

import android.graphics.ColorSpace;
import id.AbstractC3557B;
import j$.util.Objects;
import java.util.function.DoubleUnaryOperator;
import s0.AbstractC5502d;
import s0.AbstractC5507i;
import s0.C5503e;
import s0.C5514p;
import s0.C5515q;
import s0.C5516r;
import s0.C5517s;

/* loaded from: classes2.dex */
public abstract class v {
    /* JADX WARN: Type inference failed for: r6v0, types: [r0.t] */
    /* JADX WARN: Type inference failed for: r7v0, types: [r0.t] */
    public static final ColorSpace a(AbstractC5502d abstractC5502d) {
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace.Rgb.TransferParameters transferParameters;
        ColorSpace.Rgb rgb;
        ColorSpace.Named named2;
        ColorSpace colorSpace2;
        ColorSpace.Named named3;
        ColorSpace colorSpace3;
        ColorSpace.Named named4;
        ColorSpace colorSpace4;
        ColorSpace.Named named5;
        ColorSpace colorSpace5;
        ColorSpace.Named named6;
        ColorSpace colorSpace6;
        ColorSpace.Named named7;
        ColorSpace colorSpace7;
        ColorSpace.Named named8;
        ColorSpace colorSpace8;
        ColorSpace.Named named9;
        ColorSpace colorSpace9;
        ColorSpace.Named named10;
        ColorSpace colorSpace10;
        ColorSpace.Named named11;
        ColorSpace colorSpace11;
        ColorSpace.Named named12;
        ColorSpace colorSpace12;
        ColorSpace.Named named13;
        ColorSpace colorSpace13;
        ColorSpace.Named named14;
        ColorSpace colorSpace14;
        ColorSpace.Named named15;
        ColorSpace colorSpace15;
        ColorSpace.Named named16;
        ColorSpace colorSpace16;
        ColorSpace.Named named17;
        ColorSpace colorSpace17;
        if (AbstractC3557B.K(abstractC5502d, C5503e.f45028c)) {
            named17 = ColorSpace.Named.SRGB;
            colorSpace17 = ColorSpace.get(named17);
            return colorSpace17;
        } else if (AbstractC3557B.K(abstractC5502d, C5503e.f45040o)) {
            named16 = ColorSpace.Named.ACES;
            colorSpace16 = ColorSpace.get(named16);
            return colorSpace16;
        } else if (AbstractC3557B.K(abstractC5502d, C5503e.f45041p)) {
            named15 = ColorSpace.Named.ACESCG;
            colorSpace15 = ColorSpace.get(named15);
            return colorSpace15;
        } else if (AbstractC3557B.K(abstractC5502d, C5503e.f45038m)) {
            named14 = ColorSpace.Named.ADOBE_RGB;
            colorSpace14 = ColorSpace.get(named14);
            return colorSpace14;
        } else if (AbstractC3557B.K(abstractC5502d, C5503e.f45033h)) {
            named13 = ColorSpace.Named.BT2020;
            colorSpace13 = ColorSpace.get(named13);
            return colorSpace13;
        } else if (AbstractC3557B.K(abstractC5502d, C5503e.f45032g)) {
            named12 = ColorSpace.Named.BT709;
            colorSpace12 = ColorSpace.get(named12);
            return colorSpace12;
        } else if (AbstractC3557B.K(abstractC5502d, C5503e.f45043r)) {
            named11 = ColorSpace.Named.CIE_LAB;
            colorSpace11 = ColorSpace.get(named11);
            return colorSpace11;
        } else if (AbstractC3557B.K(abstractC5502d, C5503e.f45042q)) {
            named10 = ColorSpace.Named.CIE_XYZ;
            colorSpace10 = ColorSpace.get(named10);
            return colorSpace10;
        } else if (AbstractC3557B.K(abstractC5502d, C5503e.f45034i)) {
            named9 = ColorSpace.Named.DCI_P3;
            colorSpace9 = ColorSpace.get(named9);
            return colorSpace9;
        } else if (AbstractC3557B.K(abstractC5502d, C5503e.f45035j)) {
            named8 = ColorSpace.Named.DISPLAY_P3;
            colorSpace8 = ColorSpace.get(named8);
            return colorSpace8;
        } else if (AbstractC3557B.K(abstractC5502d, C5503e.f45030e)) {
            named7 = ColorSpace.Named.EXTENDED_SRGB;
            colorSpace7 = ColorSpace.get(named7);
            return colorSpace7;
        } else if (AbstractC3557B.K(abstractC5502d, C5503e.f45031f)) {
            named6 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
            colorSpace6 = ColorSpace.get(named6);
            return colorSpace6;
        } else if (AbstractC3557B.K(abstractC5502d, C5503e.f45029d)) {
            named5 = ColorSpace.Named.LINEAR_SRGB;
            colorSpace5 = ColorSpace.get(named5);
            return colorSpace5;
        } else if (AbstractC3557B.K(abstractC5502d, C5503e.f45036k)) {
            named4 = ColorSpace.Named.NTSC_1953;
            colorSpace4 = ColorSpace.get(named4);
            return colorSpace4;
        } else if (AbstractC3557B.K(abstractC5502d, C5503e.f45039n)) {
            named3 = ColorSpace.Named.PRO_PHOTO_RGB;
            colorSpace3 = ColorSpace.get(named3);
            return colorSpace3;
        } else if (AbstractC3557B.K(abstractC5502d, C5503e.f45037l)) {
            named2 = ColorSpace.Named.SMPTE_C;
            colorSpace2 = ColorSpace.get(named2);
            return colorSpace2;
        } else if (!(abstractC5502d instanceof C5515q)) {
            named = ColorSpace.Named.SRGB;
            colorSpace = ColorSpace.get(named);
            return colorSpace;
        } else {
            C5515q c5515q = (C5515q) abstractC5502d;
            float[] a5 = c5515q.f45075d.a();
            C5516r c5516r = c5515q.f45078g;
            if (c5516r != null) {
                s.p();
                transferParameters = s.g(c5516r.f45090b, c5516r.f45091c, c5516r.f45092d, c5516r.f45093e, c5516r.f45094f, c5516r.f45095g, c5516r.f45089a);
            } else {
                transferParameters = null;
            }
            if (transferParameters != null) {
                s.x();
                rgb = s.i(abstractC5502d.f45023a, ((C5515q) abstractC5502d).f45079h, a5, transferParameters);
            } else {
                s.x();
                String str = abstractC5502d.f45023a;
                C5515q c5515q2 = (C5515q) abstractC5502d;
                final C5514p c5514p = c5515q2.f45083l;
                ?? r62 = new DoubleUnaryOperator() { // from class: r0.t
                    public final /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator) {
                        int i10 = r1;
                        return Objects.requireNonNull(doubleUnaryOperator);
                    }

                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d10) {
                        int i10 = r1;
                        wf.k kVar = c5514p;
                        switch (i10) {
                            case 0:
                                return ((Number) kVar.invoke(Double.valueOf(d10))).doubleValue();
                            default:
                                return ((Number) kVar.invoke(Double.valueOf(d10))).doubleValue();
                        }
                    }

                    public final /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator) {
                        int i10 = r1;
                        return Objects.requireNonNull(doubleUnaryOperator);
                    }
                };
                final C5514p c5514p2 = c5515q2.f45086o;
                rgb = s.j(str, c5515q2.f45079h, a5, r62, new DoubleUnaryOperator() { // from class: r0.t
                    public final /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator) {
                        int i10 = r1;
                        return Objects.requireNonNull(doubleUnaryOperator);
                    }

                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d10) {
                        int i10 = r1;
                        wf.k kVar = c5514p2;
                        switch (i10) {
                            case 0:
                                return ((Number) kVar.invoke(Double.valueOf(d10))).doubleValue();
                            default:
                                return ((Number) kVar.invoke(Double.valueOf(d10))).doubleValue();
                        }
                    }

                    public final /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator) {
                        int i10 = r1;
                        return Objects.requireNonNull(doubleUnaryOperator);
                    }
                }, abstractC5502d.b(0), abstractC5502d.a(0));
            }
            return m0.e.j(rgb);
        }
    }

    public static final AbstractC5502d b(final ColorSpace colorSpace) {
        int id2;
        ColorSpace.Named named;
        int ordinal;
        ColorSpace.Named named2;
        int ordinal2;
        ColorSpace.Named named3;
        int ordinal3;
        ColorSpace.Named named4;
        int ordinal4;
        ColorSpace.Named named5;
        int ordinal5;
        ColorSpace.Named named6;
        int ordinal6;
        ColorSpace.Named named7;
        int ordinal7;
        ColorSpace.Named named8;
        int ordinal8;
        ColorSpace.Named named9;
        int ordinal9;
        ColorSpace.Named named10;
        int ordinal10;
        ColorSpace.Named named11;
        int ordinal11;
        ColorSpace.Named named12;
        int ordinal12;
        ColorSpace.Named named13;
        int ordinal13;
        ColorSpace.Named named14;
        int ordinal14;
        ColorSpace.Named named15;
        int ordinal15;
        ColorSpace.Named named16;
        int ordinal16;
        ColorSpace.Rgb.TransferParameters transferParameters;
        float[] whitePoint;
        C5517s c5517s;
        float[] whitePoint2;
        float[] whitePoint3;
        C5516r c5516r;
        String name;
        float[] primaries;
        float[] transform;
        float minValue;
        float maxValue;
        int id3;
        double d10;
        double d11;
        double d12;
        double d13;
        double d14;
        double d15;
        double d16;
        float[] whitePoint4;
        float[] whitePoint5;
        float[] whitePoint6;
        id2 = colorSpace.getId();
        named = ColorSpace.Named.SRGB;
        ordinal = named.ordinal();
        if (id2 != ordinal) {
            named2 = ColorSpace.Named.ACES;
            ordinal2 = named2.ordinal();
            if (id2 != ordinal2) {
                named3 = ColorSpace.Named.ACESCG;
                ordinal3 = named3.ordinal();
                if (id2 != ordinal3) {
                    named4 = ColorSpace.Named.ADOBE_RGB;
                    ordinal4 = named4.ordinal();
                    if (id2 != ordinal4) {
                        named5 = ColorSpace.Named.BT2020;
                        ordinal5 = named5.ordinal();
                        if (id2 != ordinal5) {
                            named6 = ColorSpace.Named.BT709;
                            ordinal6 = named6.ordinal();
                            if (id2 != ordinal6) {
                                named7 = ColorSpace.Named.CIE_LAB;
                                ordinal7 = named7.ordinal();
                                if (id2 != ordinal7) {
                                    named8 = ColorSpace.Named.CIE_XYZ;
                                    ordinal8 = named8.ordinal();
                                    if (id2 != ordinal8) {
                                        named9 = ColorSpace.Named.DCI_P3;
                                        ordinal9 = named9.ordinal();
                                        if (id2 != ordinal9) {
                                            named10 = ColorSpace.Named.DISPLAY_P3;
                                            ordinal10 = named10.ordinal();
                                            if (id2 != ordinal10) {
                                                named11 = ColorSpace.Named.EXTENDED_SRGB;
                                                ordinal11 = named11.ordinal();
                                                if (id2 != ordinal11) {
                                                    named12 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
                                                    ordinal12 = named12.ordinal();
                                                    if (id2 != ordinal12) {
                                                        named13 = ColorSpace.Named.LINEAR_SRGB;
                                                        ordinal13 = named13.ordinal();
                                                        if (id2 != ordinal13) {
                                                            named14 = ColorSpace.Named.NTSC_1953;
                                                            ordinal14 = named14.ordinal();
                                                            if (id2 != ordinal14) {
                                                                named15 = ColorSpace.Named.PRO_PHOTO_RGB;
                                                                ordinal15 = named15.ordinal();
                                                                if (id2 != ordinal15) {
                                                                    named16 = ColorSpace.Named.SMPTE_C;
                                                                    ordinal16 = named16.ordinal();
                                                                    if (id2 == ordinal16) {
                                                                        return C5503e.f45037l;
                                                                    }
                                                                    if (m0.e.n(colorSpace)) {
                                                                        transferParameters = m0.e.h(colorSpace).getTransferParameters();
                                                                        whitePoint = m0.e.h(colorSpace).getWhitePoint();
                                                                        if (whitePoint.length == 3) {
                                                                            whitePoint4 = m0.e.h(colorSpace).getWhitePoint();
                                                                            float f6 = whitePoint4[0];
                                                                            whitePoint5 = m0.e.h(colorSpace).getWhitePoint();
                                                                            float f10 = whitePoint5[1];
                                                                            whitePoint6 = m0.e.h(colorSpace).getWhitePoint();
                                                                            float f11 = f6 + f10 + whitePoint6[2];
                                                                            c5517s = new C5517s(f6 / f11, f10 / f11);
                                                                        } else {
                                                                            whitePoint2 = m0.e.h(colorSpace).getWhitePoint();
                                                                            float f12 = whitePoint2[0];
                                                                            whitePoint3 = m0.e.h(colorSpace).getWhitePoint();
                                                                            c5517s = new C5517s(f12, whitePoint3[1]);
                                                                        }
                                                                        C5517s c5517s2 = c5517s;
                                                                        if (transferParameters != null) {
                                                                            d10 = transferParameters.g;
                                                                            d11 = transferParameters.a;
                                                                            d12 = transferParameters.b;
                                                                            d13 = transferParameters.c;
                                                                            d14 = transferParameters.d;
                                                                            d15 = transferParameters.e;
                                                                            d16 = transferParameters.f;
                                                                            c5516r = new C5516r(d10, d11, d12, d13, d14, d15, d16);
                                                                        } else {
                                                                            c5516r = null;
                                                                        }
                                                                        name = m0.e.h(colorSpace).getName();
                                                                        primaries = m0.e.h(colorSpace).getPrimaries();
                                                                        transform = m0.e.h(colorSpace).getTransform();
                                                                        AbstractC5507i abstractC5507i = new AbstractC5507i() { // from class: r0.u
                                                                            @Override // s0.AbstractC5507i
                                                                            public final double c(double d17) {
                                                                                DoubleUnaryOperator oetf;
                                                                                DoubleUnaryOperator eotf;
                                                                                int i10 = r2;
                                                                                ColorSpace colorSpace2 = colorSpace;
                                                                                switch (i10) {
                                                                                    case 0:
                                                                                        oetf = s.h(colorSpace2).getOetf();
                                                                                        return oetf.applyAsDouble(d17);
                                                                                    default:
                                                                                        eotf = s.h(colorSpace2).getEotf();
                                                                                        return eotf.applyAsDouble(d17);
                                                                                }
                                                                            }
                                                                        };
                                                                        AbstractC5507i abstractC5507i2 = new AbstractC5507i() { // from class: r0.u
                                                                            @Override // s0.AbstractC5507i
                                                                            public final double c(double d17) {
                                                                                DoubleUnaryOperator oetf;
                                                                                DoubleUnaryOperator eotf;
                                                                                int i10 = r2;
                                                                                ColorSpace colorSpace2 = colorSpace;
                                                                                switch (i10) {
                                                                                    case 0:
                                                                                        oetf = s.h(colorSpace2).getOetf();
                                                                                        return oetf.applyAsDouble(d17);
                                                                                    default:
                                                                                        eotf = s.h(colorSpace2).getEotf();
                                                                                        return eotf.applyAsDouble(d17);
                                                                                }
                                                                            }
                                                                        };
                                                                        minValue = colorSpace.getMinValue(0);
                                                                        maxValue = colorSpace.getMaxValue(0);
                                                                        id3 = m0.e.h(colorSpace).getId();
                                                                        return new C5515q(name, primaries, c5517s2, transform, abstractC5507i, abstractC5507i2, minValue, maxValue, c5516r, id3);
                                                                    }
                                                                    return C5503e.f45028c;
                                                                }
                                                                return C5503e.f45039n;
                                                            }
                                                            return C5503e.f45036k;
                                                        }
                                                        return C5503e.f45029d;
                                                    }
                                                    return C5503e.f45031f;
                                                }
                                                return C5503e.f45030e;
                                            }
                                            return C5503e.f45035j;
                                        }
                                        return C5503e.f45034i;
                                    }
                                    return C5503e.f45042q;
                                }
                                return C5503e.f45043r;
                            }
                            return C5503e.f45032g;
                        }
                        return C5503e.f45033h;
                    }
                    return C5503e.f45038m;
                }
                return C5503e.f45041p;
            }
            return C5503e.f45040o;
        }
        return C5503e.f45028c;
    }
}
