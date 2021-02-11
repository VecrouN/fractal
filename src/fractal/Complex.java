package fractal;

public class Complex {

	private double mRe;
	private double mIm;

	public Complex(double re, double im) {
		mRe = re;
		mIm = im;
	}

	public double getRe() {
		return mRe;
	}

	public double getIm() {
		return mIm;
	}

	public double abs() {
		return Math.sqrt(mRe * mRe + mIm * mIm);
	}

	@Override
	public String toString() {
		return "Re = " + mRe + ", Im = " + mIm;
	}
}
