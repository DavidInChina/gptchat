package li;

/* renamed from: li.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4499c {

    /* renamed from: a  reason: collision with root package name */
    public static final double[][] f38530a = {new double[]{1.0d, 5.669184079525E-24d}, new double[]{-0.25d, -0.25d}, new double[]{0.3333333134651184d, 1.986821492305628E-8d}, new double[]{-0.25d, -6.663542893624021E-14d}, new double[]{0.19999998807907104d, 1.1921056801463227E-8d}, new double[]{-0.1666666567325592d, -7.800414592973399E-9d}, new double[]{0.1428571343421936d, 5.650007086920087E-9d}, new double[]{-0.12502530217170715d, -7.44321345601866E-11d}, new double[]{0.11113807559013367d, 9.219544613762692E-9d}};

    /* renamed from: b  reason: collision with root package name */
    public static final double[] f38531b = {0.0d, 0.1246747374534607d, 0.24740394949913025d, 0.366272509098053d, 0.4794255495071411d, 0.5850973129272461d, 0.6816387176513672d, 0.7675435543060303d, 0.8414709568023682d, 0.902267575263977d, 0.9489846229553223d, 0.9808930158615112d, 0.9974949359893799d, 0.9985313415527344d};

    /* renamed from: c  reason: collision with root package name */
    public static final double[] f38532c = {0.0d, -4.068233003401932E-9d, 9.755392680573412E-9d, 1.9987994582857286E-8d, -1.0902938113007961E-8d, -3.9986783938944604E-8d, 4.23719669792332E-8d, -5.207000323380292E-8d, 2.800552834259E-8d, 1.883511811213715E-8d, -3.5997360512765566E-9d, 4.116164446561962E-8d, 5.0614674548127384E-8d, -1.0129027912496858E-9d};

    /* renamed from: d  reason: collision with root package name */
    public static final double[] f38533d = {1.0d, 0.9921976327896118d, 0.9689123630523682d, 0.9305076599121094d, 0.8775825500488281d, 0.8109631538391113d, 0.7316888570785522d, 0.6409968137741089d, 0.5403022766113281d, 0.4311765432357788d, 0.3153223395347595d, 0.19454771280288696d, 0.07073719799518585d, -0.05417713522911072d};

    /* renamed from: e  reason: collision with root package name */
    public static final double[] f38534e = {0.0d, 3.4439717236742845E-8d, 5.865827662008209E-8d, -3.7999795083850525E-8d, 1.184154459111628E-8d, -3.43338934259355E-8d, 1.1795268640216787E-8d, 4.438921624363781E-8d, 2.925681159240093E-8d, -2.6437112632041807E-8d, 2.2860509143963117E-8d, -4.813899778443457E-9d, 3.6725170580355583E-9d, 2.0217439756338078E-10d};

    /* renamed from: f  reason: collision with root package name */
    public static final long[] f38535f = {2935890503282001226L, 9154082963658192752L, 3952090531849364496L, 9193070505571053912L, 7910884519577875640L, 113236205062349959L, 4577762542105553359L, -5034868814120038111L, 4208363204685324176L, 5648769086999809661L, 2819561105158720014L, -4035746434778044925L, -302932621132653753L, -2644281811660520851L, -3183605296591799669L, 6722166367014452318L, -3512299194304650054L, -7278142539171889152L};

    /* renamed from: g  reason: collision with root package name */
    public static final long[] f38536g = {-3958705157555305932L, -4267615245585081135L};

    /* renamed from: h  reason: collision with root package name */
    public static final double[] f38537h = {0.0d, 0.125d, 0.25d, 0.375d, 0.5d, 0.625d, 0.75d, 0.875d, 1.0d, 1.125d, 1.25d, 1.375d, 1.5d, 1.625d};

    static {
        StrictMath.log(Double.MAX_VALUE);
    }

    public static double a(double d10) {
        double d11;
        int i10 = (d10 > d10 ? 1 : (d10 == d10 ? 0 : -1));
        if (i10 != 0) {
            return d10;
        }
        if (i10 != 0 || d10 >= 4.503599627370496E15d || d10 <= -4.503599627370496E15d) {
            d11 = d10;
        } else {
            long j6 = (long) d10;
            if (d10 < 0.0d && j6 != d10) {
                j6--;
            }
            if (j6 == 0) {
                d11 = j6 * d10;
            } else {
                d11 = j6;
            }
        }
        if (d11 == d10) {
            return d11;
        }
        double d12 = d11 + 1.0d;
        if (d12 == 0.0d) {
            return d10 * d12;
        }
        return d12;
    }

    public static double b(double d10) {
        double h10;
        double d11 = 0.0d;
        if (d10 < 0.0d) {
            d10 = -d10;
        }
        if (d10 != d10 || d10 == Double.POSITIVE_INFINITY) {
            return Double.NaN;
        }
        int i10 = 0;
        if (d10 > 3294198.0d) {
            double[] dArr = new double[3];
            f(d10, dArr);
            i10 = ((int) dArr[0]) & 3;
            d10 = dArr[1];
            d11 = dArr[2];
        } else if (d10 > 1.5707963267948966d) {
            C4497a c4497a = new C4497a(d10);
            i10 = c4497a.f38526a & 3;
            d10 = c4497a.f38527b;
            d11 = c4497a.f38528c;
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return Double.NaN;
                    }
                    return h(d10, d11);
                }
                h10 = c(d10, d11);
            } else {
                h10 = h(d10, d11);
            }
            return -h10;
        }
        return c(d10, d11);
    }

    public static double c(double d10, double d11) {
        double d12 = 1.5707963267948966d - d10;
        return h(d12, (6.123233995736766E-17d - d11) + (-((d12 - 1.5707963267948966d) + d10)));
    }

    public static double d(double d10) {
        int i10 = (d10 > 0.0d ? 1 : (d10 == 0.0d ? 0 : -1));
        if (i10 == 0) {
            return Double.NEGATIVE_INFINITY;
        }
        long doubleToRawLongBits = Double.doubleToRawLongBits(d10);
        if (((Long.MIN_VALUE & doubleToRawLongBits) != 0 || d10 != d10) && i10 != 0) {
            return Double.NaN;
        }
        if (d10 == Double.POSITIVE_INFINITY) {
            return Double.POSITIVE_INFINITY;
        }
        int i11 = ((int) (doubleToRawLongBits >> 52)) - 1023;
        if ((9218868437227405312L & doubleToRawLongBits) == 0) {
            if (i10 == 0) {
                return Double.NEGATIVE_INFINITY;
            }
            doubleToRawLongBits <<= 1;
            while ((4503599627370496L & doubleToRawLongBits) == 0) {
                i11--;
                doubleToRawLongBits <<= 1;
            }
        }
        if ((i11 == -1 || i11 == 0) && d10 < 1.01d && d10 > 0.99d) {
            double d11 = d10 - 1.0d;
            double d12 = d11 * 1.073741824E9d;
            double d13 = (d11 + d12) - d12;
            double d14 = d11 - d13;
            double[][] dArr = f38530a;
            double[] dArr2 = dArr[dArr.length - 1];
            double d15 = dArr2[0];
            double d16 = dArr2[1];
            for (int length = dArr.length - 2; length >= 0; length--) {
                double d17 = d15 * d13;
                double d18 = (d16 * d14) + (d16 * d13) + (d15 * d14);
                double d19 = d17 * 1.073741824E9d;
                double d20 = (d17 + d19) - d19;
                double[] dArr3 = dArr[length];
                double d21 = d20 + dArr3[0];
                double d22 = d21 * 1.073741824E9d;
                d15 = (d21 + d22) - d22;
                d16 = (d21 - d15) + (d17 - d20) + d18 + dArr3[1];
            }
            double d23 = d15 * d13;
            double d24 = d13 * d16;
            double d25 = d16 * d14;
            double d26 = 1.073741824E9d * d23;
            double d27 = (d23 + d26) - d26;
            return (d23 - d27) + d25 + d24 + (d15 * d14) + d27;
        }
        long j6 = 4499201580859392L & doubleToRawLongBits;
        double[] dArr4 = AbstractC4498b.f38529a[(int) (j6 >> 42)];
        double d28 = (doubleToRawLongBits & 4398046511103L) / (j6 + 4.503599627370496E15d);
        double d29 = (((((((((((-0.16624882440418567d) * d28) + 0.19999954120254515d) * d28) - 0.2499999997677497d) * d28) + 0.3333333333332802d) * d28) - 0.5d) * d28) + 1.0d) * d28;
        double d30 = i11;
        double d31 = 0.6931470632553101d * d30;
        double d32 = dArr4[0];
        double d33 = d31 + d32;
        double d34 = d33 + d29;
        double d35 = (-((d33 - d31) - d32)) + 0.0d + (-((d34 - d33) - d29));
        double d36 = d30 * 1.1730463525082348E-7d;
        double d37 = d34 + d36;
        double d38 = d35 + (-((d37 - d34) - d36));
        double d39 = dArr4[1];
        double d40 = d37 + d39;
        double d41 = d40 + 0.0d;
        return d38 + (-((d40 - d37) - d39)) + (-((d41 - d40) - 0.0d)) + d41;
    }

    public static long e(long j6, long j10) {
        if (j6 > j10) {
            return j10;
        }
        return j6;
    }

    public static void f(double d10, double[] dArr) {
        long j6;
        long j10;
        long j11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        long j12;
        boolean z30;
        long j13;
        long doubleToRawLongBits = Double.doubleToRawLongBits(d10);
        int i10 = ((int) ((doubleToRawLongBits >> 52) & 2047)) - 1022;
        long j14 = ((doubleToRawLongBits & 4503599627370495L) | 4503599627370496L) << 11;
        int i11 = i10 >> 6;
        int i12 = i10 - (i11 << 6);
        long[] jArr = f38535f;
        if (i12 != 0) {
            if (i11 == 0) {
                j13 = 0;
            } else {
                j13 = jArr[i11 - 1] << i12;
            }
            long j15 = jArr[i11];
            int i13 = 64 - i12;
            j10 = j13 | (j15 >>> i13);
            long j16 = jArr[i11 + 1];
            j6 = (j15 << i12) | (j16 >>> i13);
            j11 = (jArr[i11 + 2] >>> i13) | (j16 << i12);
        } else {
            if (i11 == 0) {
                j10 = 0;
            } else {
                j10 = jArr[i11 - 1];
            }
            j6 = jArr[i11];
            j11 = jArr[i11 + 1];
        }
        long j17 = j14 >>> 32;
        long j18 = j14 & 4294967295L;
        long j19 = j6 >>> 32;
        long j20 = j6 & 4294967295L;
        long j21 = j17 * j19;
        long j22 = j18 * j20;
        long j23 = j19 * j18;
        long j24 = j20 * j17;
        long j25 = j22 + (j24 << 32);
        long j26 = j21 + (j24 >>> 32);
        if ((j22 & Long.MIN_VALUE) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((j24 & 2147483648L) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i14 = ((j25 & Long.MIN_VALUE) > 0L ? 1 : ((j25 & Long.MIN_VALUE) == 0L ? 0 : -1));
        if (i14 != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if ((z10 && z11) || ((z10 || z11) && !z12)) {
            j26++;
        }
        if (i14 != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if ((j23 & 2147483648L) != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        long j27 = j25 + (j23 << 32);
        long j28 = j26 + (j23 >>> 32);
        int i15 = ((j27 & Long.MIN_VALUE) > 0L ? 1 : ((j27 & Long.MIN_VALUE) == 0L ? 0 : -1));
        if (i15 != 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        if ((z13 && z14) || ((z13 || z14) && !z15)) {
            j28++;
        }
        long j29 = j11 >>> 32;
        long j30 = (j17 * j29) + ((((j11 & 4294967295L) * j17) + (j29 * j18)) >>> 32);
        if (i15 != 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        if ((j30 & Long.MIN_VALUE) != 0) {
            z17 = true;
        } else {
            z17 = false;
        }
        long j31 = j27 + j30;
        if ((j31 & Long.MIN_VALUE) != 0) {
            z18 = true;
        } else {
            z18 = false;
        }
        if ((z16 && z17) || ((z16 || z17) && !z18)) {
            j28++;
        }
        long j32 = j10 >>> 32;
        long j33 = j10 & 4294967295L;
        long j34 = (j18 * j33) + (((j17 * j33) + (j18 * j32)) << 32) + j28;
        int i16 = (int) (j34 >>> 62);
        long j35 = (j34 << 2) | (j31 >>> 62);
        long j36 = j31 << 2;
        long j37 = j35 >>> 32;
        long j38 = j35 & 4294967295L;
        long[] jArr2 = f38536g;
        long j39 = jArr2[0];
        long j40 = j39 >>> 32;
        long j41 = j39 & 4294967295L;
        long j42 = j38 * j41;
        long j43 = j38 * j40;
        long j44 = j37 * j41;
        long j45 = j42 + (j44 << 32);
        long j46 = (j37 * j40) + (j44 >>> 32);
        if ((j42 & Long.MIN_VALUE) != 0) {
            z19 = true;
        } else {
            z19 = false;
        }
        if ((j44 & 2147483648L) != 0) {
            z20 = true;
        } else {
            z20 = false;
        }
        int i17 = ((j45 & Long.MIN_VALUE) > 0L ? 1 : ((j45 & Long.MIN_VALUE) == 0L ? 0 : -1));
        if (i17 != 0) {
            z21 = true;
        } else {
            z21 = false;
        }
        if ((z19 && z20) || ((z19 || z20) && !z21)) {
            j46++;
        }
        if (i17 != 0) {
            z22 = true;
        } else {
            z22 = false;
        }
        if ((j43 & 2147483648L) != 0) {
            z23 = true;
        } else {
            z23 = false;
        }
        long j47 = j45 + (j43 << 32);
        long j48 = j46 + (j43 >>> 32);
        int i18 = ((j47 & Long.MIN_VALUE) > 0L ? 1 : ((j47 & Long.MIN_VALUE) == 0L ? 0 : -1));
        if (i18 != 0) {
            z24 = true;
        } else {
            z24 = false;
        }
        if ((z22 && z23) || ((z22 || z23) && !z24)) {
            j48++;
        }
        long j49 = jArr2[1];
        long j50 = j49 >>> 32;
        long j51 = (j37 * j50) + (((j37 * (j49 & 4294967295L)) + (j38 * j50)) >>> 32);
        if (i18 != 0) {
            z25 = true;
        } else {
            z25 = false;
        }
        if ((j51 & Long.MIN_VALUE) != 0) {
            z26 = true;
        } else {
            z26 = false;
        }
        long j52 = j47 + j51;
        int i19 = ((j52 & Long.MIN_VALUE) > 0L ? 1 : ((j52 & Long.MIN_VALUE) == 0L ? 0 : -1));
        if (i19 != 0) {
            z27 = true;
        } else {
            z27 = false;
        }
        if ((z25 && z26) || ((z25 || z26) && !z27)) {
            j48++;
        }
        long j53 = j36 >>> 32;
        long j54 = (j53 * j40) + (((j53 * j41) + ((j36 & 4294967295L) * j40)) >>> 32);
        if (i19 != 0) {
            z28 = true;
        } else {
            z28 = false;
        }
        if ((j54 & Long.MIN_VALUE) != 0) {
            z29 = true;
        } else {
            z29 = false;
        }
        if (((j52 + j54) & Long.MIN_VALUE) != 0) {
            z30 = true;
        } else {
            z30 = false;
        }
        if ((z28 && z29) || ((z28 || z29) && !z30)) {
            j48++;
        }
        double d11 = (j48 >>> 12) / 4.503599627370496E15d;
        double d12 = ((((j48 & 4095) << 40) + (j12 >>> 24)) / 4.503599627370496E15d) / 4.503599627370496E15d;
        double d13 = d11 + d12;
        dArr[0] = i16;
        dArr[1] = d13 * 2.0d;
        dArr[2] = (-((d13 - d11) - d12)) * 2.0d;
    }

    public static double g(double d10) {
        double d11;
        boolean z10;
        double h10;
        double d12 = 0.0d;
        int i10 = 0;
        if (d10 < 0.0d) {
            d11 = -d10;
            z10 = true;
        } else {
            d11 = d10;
            z10 = false;
        }
        if (d11 == 0.0d) {
            if (Double.doubleToRawLongBits(d10) >= 0) {
                return 0.0d;
            }
            return -0.0d;
        } else if (d11 != d11 || d11 == Double.POSITIVE_INFINITY) {
            return Double.NaN;
        } else {
            if (d11 > 3294198.0d) {
                double[] dArr = new double[3];
                f(d11, dArr);
                i10 = ((int) dArr[0]) & 3;
                d11 = dArr[1];
                d12 = dArr[2];
            } else if (d11 > 1.5707963267948966d) {
                C4497a c4497a = new C4497a(d11);
                i10 = c4497a.f38526a & 3;
                d11 = c4497a.f38527b;
                d12 = c4497a.f38528c;
            }
            if (z10) {
                i10 ^= 2;
            }
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            return Double.NaN;
                        }
                        h10 = c(d11, d12);
                    } else {
                        h10 = h(d11, d12);
                    }
                    return -h10;
                }
                return c(d11, d12);
            }
            return h(d11, d12);
        }
    }

    public static double h(double d10, double d11) {
        int i10 = (int) ((8.0d * d10) + 0.5d);
        double d12 = d10 - f38537h[i10];
        double d13 = f38531b[i10];
        double d14 = f38532c[i10];
        double d15 = f38533d[i10];
        double d16 = f38534e[i10];
        double d17 = d12 * d12;
        double d18 = ((((((2.7553817452272217E-6d * d17) - 1.9841269659586505E-4d) * d17) + 0.008333333333329196d) * d17) - 0.16666666666666666d) * d17 * d12;
        double d19 = ((((((2.479773539153719E-5d * d17) - 0.0013888888689039883d) * d17) + 0.041666666666621166d) * d17) - 0.49999999999999994d) * d17;
        double d20 = 1.073741824E9d * d12;
        double d21 = (d12 + d20) - d20;
        double d22 = (d12 - d21) + d18;
        double d23 = d13 + 0.0d;
        double d24 = d15 * d21;
        double d25 = d23 + d24;
        double d26 = d16 * d21;
        double d27 = (d16 * d22) + (d14 * d19) + d26 + (d15 * d22) + (d13 * d19) + (-((d23 - 0.0d) - d13)) + 0.0d + (-((d25 - d23) - d24)) + d14;
        if (d11 != 0.0d) {
            double d28 = (((d19 + 1.0d) * (d15 + d16)) - ((d21 + d22) * (d13 + d14))) * d11;
            double d29 = d25 + d28;
            d27 += -((d29 - d25) - d28);
            d25 = d29;
        }
        return d25 + d27;
    }
}
