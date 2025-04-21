export interface Movie{
    id: number | null;
    name: string;
    img: string;
    cast: string;
    year: number;
    rating: number;
    plot: string;
}

export interface Booking{
    id: number | null;
    name:string;
    date: string;
    seats: number;
}